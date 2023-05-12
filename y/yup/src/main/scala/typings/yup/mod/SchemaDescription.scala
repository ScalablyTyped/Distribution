package typings.yup.mod

import typings.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDescription
  extends StObject
     with SchemaFieldDescription {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[js.Object] = js.undefined
  
  var notOneOf: js.Array[Any]
  
  var nullable: Boolean
  
  var oneOf: js.Array[Any]
  
  var optional: Boolean
  
  var tests: js.Array[Name]
  
  var `type`: String
}
object SchemaDescription {
  
  inline def apply(
    notOneOf: js.Array[Any],
    nullable: Boolean,
    oneOf: js.Array[Any],
    optional: Boolean,
    tests: js.Array[Name],
    `type`: String
  ): SchemaDescription = {
    val __obj = js.Dynamic.literal(notOneOf = notOneOf.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaDescription] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setNotOneOf(value: js.Array[Any]): Self = StObject.set(x, "notOneOf", value.asInstanceOf[js.Any])
    
    inline def setNotOneOfVarargs(value: Any*): Self = StObject.set(x, "notOneOf", js.Array(value*))
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setOneOf(value: js.Array[Any]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfVarargs(value: Any*): Self = StObject.set(x, "oneOf", js.Array(value*))
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setTests(value: js.Array[Name]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    inline def setTestsVarargs(value: Name*): Self = StObject.set(x, "tests", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
