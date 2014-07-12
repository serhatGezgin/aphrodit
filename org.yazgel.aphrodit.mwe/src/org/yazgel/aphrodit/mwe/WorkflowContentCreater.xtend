package org.yazgel.aphrodit.mwe

class WorkflowContentCreater {
	
	def static  String createWorkflow(String fileName, String contentDirectoryUri, String outPutFolderUri) {
'''
module «fileName»

import org.yazgel.aphrodit.mwe.*

Workflow {

	component = ResourceReader {
		uri = "«contentDirectoryUri»"
	}
	component = BootstrapGenerator{
		outPutFolderUri = "«outPutFolderUri»"		
	}

}
'''
    }
    
}