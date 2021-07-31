package typings.zoneJs

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UncaughtPromiseError
  extends StObject
     with Error {
  
  var promise: js.Promise[js.Any]
  
  var rejection: js.Any
  
  var task: Task
  
  var throwOriginal: js.UndefOr[Boolean] = js.undefined
  
  var zone: Zone
}
object UncaughtPromiseError {
  
  @scala.inline
  def apply(
    message: String,
    name: String,
    promise: js.Promise[js.Any],
    rejection: js.Any,
    task: Task,
    zone: Zone
  ): UncaughtPromiseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], rejection = rejection.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], zone = zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncaughtPromiseError]
  }
  
  @scala.inline
  implicit class UncaughtPromiseErrorMutableBuilder[Self <: UncaughtPromiseError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromise(value: js.Promise[js.Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejection(value: js.Any): Self = StObject.set(x, "rejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOriginal(value: Boolean): Self = StObject.set(x, "throwOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOriginalUndefined: Self = StObject.set(x, "throwOriginal", js.undefined)
    
    @scala.inline
    def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
  }
}
