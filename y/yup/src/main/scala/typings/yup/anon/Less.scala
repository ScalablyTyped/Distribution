package typings.yup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Less extends StObject {
  
  var less: Double = js.native
}
object Less {
  
  @scala.inline
  def apply(less: Double): Less = {
    val __obj = js.Dynamic.literal(less = less.asInstanceOf[js.Any])
    __obj.asInstanceOf[Less]
  }
  
  @scala.inline
  implicit class LessMutableBuilder[Self <: Less] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLess(value: Double): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
  }
}
