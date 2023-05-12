package typings.yup.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LazySpec extends StObject {
  
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  var optional: Boolean
}
object LazySpec {
  
  inline def apply(optional: Boolean): LazySpec = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazySpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LazySpec] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
  }
}
