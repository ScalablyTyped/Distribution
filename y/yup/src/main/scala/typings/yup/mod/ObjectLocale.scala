package typings.yup.mod

import typings.yup.anon.PartialTestMessageParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLocale extends StObject {
  
  var noUnknown: js.UndefOr[TestOptionsMessage[js.Object, js.Any]] = js.undefined
}
object ObjectLocale {
  
  @scala.inline
  def apply(): ObjectLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLocale]
  }
  
  @scala.inline
  implicit class ObjectLocaleMutableBuilder[Self <: ObjectLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoUnknown(value: TestOptionsMessage[js.Object, js.Any]): Self = StObject.set(x, "noUnknown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoUnknownFunction1(value: /* params */ js.Object & PartialTestMessageParams => js.Any): Self = StObject.set(x, "noUnknown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNoUnknownUndefined: Self = StObject.set(x, "noUnknown", js.undefined)
  }
}
