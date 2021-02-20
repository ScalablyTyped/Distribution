package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait More extends StObject {
  
  var more: Double = js.native
}
object More {
  
  @scala.inline
  def apply(more: Double): More = {
    val __obj = js.Dynamic.literal(more = more.asInstanceOf[js.Any])
    __obj.asInstanceOf[More]
  }
  
  @scala.inline
  implicit class MoreMutableBuilder[Self <: More] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMore(value: Double): Self = StObject.set(x, "more", value.asInstanceOf[js.Any])
  }
}
