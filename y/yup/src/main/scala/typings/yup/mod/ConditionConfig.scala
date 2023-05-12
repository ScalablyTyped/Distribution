package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionConfig[T /* <: ISchema[Any, Any, Any, Any] */] extends StObject {
  
  var is: Any | (js.Function1[/* repeated */ Any, Boolean])
  
  var otherwise: js.UndefOr[js.Function1[/* schema */ T, ISchema[Any, Any, Any, Any]]] = js.undefined
  
  var `then`: js.UndefOr[js.Function1[/* schema */ T, ISchema[Any, Any, Any, Any]]] = js.undefined
}
object ConditionConfig {
  
  inline def apply[T /* <: ISchema[Any, Any, Any, Any] */](is: Any | (js.Function1[/* repeated */ Any, Boolean])): ConditionConfig[T] = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionConfig[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionConfig[?], T /* <: ISchema[Any, Any, Any, Any] */] (val x: Self & ConditionConfig[T]) extends AnyVal {
    
    inline def setIs(value: Any | (js.Function1[/* repeated */ Any, Boolean])): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setIsFunction1(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
    
    inline def setOtherwise(value: /* schema */ T => ISchema[Any, Any, Any, Any]): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
    
    inline def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
    
    inline def setThen(value: /* schema */ T => ISchema[Any, Any, Any, Any]): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
  }
}
