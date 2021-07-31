package typings.yup.anon

import typings.yup.mod.WhenOptionsBuilderObjectIs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Is extends StObject {
  
  var is: WhenOptionsBuilderObjectIs
  
  var otherwise: js.Any
  
  var `then`: js.Any
}
object Is {
  
  @scala.inline
  def apply(otherwise: js.Any, `then`: js.Any): Is = {
    val __obj = js.Dynamic.literal(otherwise = otherwise.asInstanceOf[js.Any], is = null)
    __obj.updateDynamic("then")(`then`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Is]
  }
  
  @scala.inline
  implicit class IsMutableBuilder[Self <: Is] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIs(value: WhenOptionsBuilderObjectIs): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFunction1(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNull: Self = StObject.set(x, "is", null)
    
    @scala.inline
    def setOtherwise(value: js.Any): Self = StObject.set(x, "otherwise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThen(value: js.Any): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
  }
}
