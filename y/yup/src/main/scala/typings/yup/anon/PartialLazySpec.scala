package typings.yup.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<yup.yup.LazySpec> */
trait PartialLazySpec extends StObject {
  
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
}
object PartialLazySpec {
  
  inline def apply(): PartialLazySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLazySpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialLazySpec] (val x: Self) extends AnyVal {
    
    inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
