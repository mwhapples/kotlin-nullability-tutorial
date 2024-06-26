/*
 * This source file was generated by the Gradle 'init' task
 */
package org.aph

import kotlin.test.Test

class WorkDialogServiceTest {
    @Test fun normalWorkFlow() {
        val workDialog = WorkDialogService()
        workDialog.open(title = "Test title", message = "Test message")
        workDialog.doWork { updater ->
            updater(100)
        }
        workDialog.close()
    }
    @Test fun callingDoWorkBeforeOpen() {
        val workDialog = WorkDialogService()
        workDialog.doWork { it(100) }
    }
    @Test fun callCloseBeforeOpen() {
        val workDialogService = WorkDialogService()
        workDialogService.close()
    }
    @Test fun callCloseTwice() {
        val workDialog = WorkDialogService()
        workDialog.open(title = "Test title", message = "Test message")
        workDialog.doWork { it(50) }
        workDialog.close()
        workDialog.close()
    }
}
