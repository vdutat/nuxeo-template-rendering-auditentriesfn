package org.nuxeo.template.context.extensions;

import java.util.List;
import java.util.Map;

import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.platform.audit.api.LogEntry;
import org.nuxeo.template.api.context.ContextExtensionFactory;
import org.nuxeo.template.api.context.DocumentWrapper;

public class AuditEntriesFunctionsExtensionFactory implements ContextExtensionFactory {

	@Override
	public Object getExtension(DocumentModel currentDocument, DocumentWrapper wrapper,
			Map<String, Object> ctx) {
		return new AuditEntriesFunctionsExtension((List<LogEntry>) ctx.get("auditEntries"), wrapper);
	}

}
