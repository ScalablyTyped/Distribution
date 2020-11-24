package typings.zeditUpf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Executor[S, L] extends js.Object {
  
  /**
    * Called after processing.
    * Can be used to perform any cleanup/final steps
    * once your patcher has finished executing.
    *
    * Note that UPF automatically removes ITPO records and unused masters,
    * so you don't need to do that here.
    */
  @JSName("finalize")
  var finalize_FExecutor: js.UndefOr[js.Function1[/* args */ ExectuteCTX[S, L], Unit]] = js.native
  
  /**
    * Perform anything that needs to be done once at the beginning of the
    * patcher's execution here.
    * This can be used to cache records which don't need to be patched,
    * but need to be referred to later on.  Store values
    */
  var initialize: js.UndefOr[js.Function1[/* args */ ExectuteCTX[S, L], Unit]] = js.native
  
  /**
    * Array of process blocks.
    *
    * The blocks are run sequentially
    */
  var process: js.Array[ProcessBlock[S, L]] = js.native
}
object Executor {
  
  @scala.inline
  def apply[S, L](process: js.Array[ProcessBlock[S, L]]): Executor[S, L] = {
    val __obj = js.Dynamic.literal(process = process.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executor[S, L]]
  }
  
  @scala.inline
  implicit class ExecutorOps[Self <: Executor[_, _], S, L] (val x: Self with (Executor[S, L])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessVarargs(value: (ProcessBlock[S, L])*): Self = this.set("process", js.Array(value :_*))
    
    @scala.inline
    def setProcess(value: js.Array[ProcessBlock[S, L]]): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalize(value: /* args */ ExectuteCTX[S, L] => Unit): Self = this.set("finalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFinalize: Self = this.set("finalize", js.undefined)
    
    @scala.inline
    def setInitialize(value: /* args */ ExectuteCTX[S, L] => Unit): Self = this.set("initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
  }
}
