package org.nuxeo.template.context.extensions;

import java.util.List;

import org.nuxeo.ecm.platform.audit.api.LogEntry;
import org.nuxeo.template.api.context.DocumentWrapper;

public class AuditEntriesFunctionsExtension {

    protected final List<LogEntry> auditEntries;

    protected final DocumentWrapper nuxeoWrapper;

    public AuditEntriesFunctionsExtension(List<LogEntry> auditEntries, DocumentWrapper nuxeoWrapper) {
        this.auditEntries = auditEntries;
        this.nuxeoWrapper = nuxeoWrapper;
    }

    public Object last(int nbr) throws Exception {
    	if (nbr > auditEntries.size()) {
    		return nuxeoWrapper.wrap(auditEntries);
    	}
        return nuxeoWrapper.wrap(auditEntries.subList(0, nbr));
    }
}
