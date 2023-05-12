package typings.yup.anon

import typings.yup.mod.TestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OPTIONS extends StObject {
  
  var OPTIONS: js.UndefOr[TestConfig[Any, js.Object]] = js.undefined
}
object OPTIONS {
  
  inline def apply(): OPTIONS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OPTIONS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OPTIONS] (val x: Self) extends AnyVal {
    
    inline def setOPTIONS(value: TestConfig[Any, js.Object]): Self = StObject.set(x, "OPTIONS", value.asInstanceOf[js.Any])
    
    inline def setOPTIONSUndefined: Self = StObject.set(x, "OPTIONS", js.undefined)
  }
}
