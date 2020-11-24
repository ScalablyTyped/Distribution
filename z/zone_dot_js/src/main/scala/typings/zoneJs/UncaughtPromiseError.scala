package typings.zoneJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UncaughtPromiseError extends Error {
  
  var promise: js.Promise[_] = js.native
  
  var rejection: js.Any = js.native
  
  var task: Task = js.native
  
  var throwOriginal: js.UndefOr[Boolean] = js.native
  
  var zone: Zone = js.native
}
object UncaughtPromiseError {
  
  @scala.inline
  def apply(message: String, name: String, promise: js.Promise[_], rejection: js.Any, task: Task, zone: Zone): UncaughtPromiseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], rejection = rejection.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncaughtPromiseError]
  }
  
  @scala.inline
  implicit class UncaughtPromiseErrorOps[Self <: UncaughtPromiseError] (val x: Self) extends AnyVal {
    
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
    def setPromise(value: js.Promise[_]): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejection(value: js.Any): Self = this.set("rejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: Task): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZone(value: Zone): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOriginal(value: Boolean): Self = this.set("throwOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowOriginal: Self = this.set("throwOriginal", js.undefined)
  }
}
