package typings.yup.mod

import typings.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yup.mod.SchemaFieldDescription because Already inherited */ trait SchemaInnerTypeDescription
  extends StObject
     with SchemaDescription {
  
  var innerType: js.UndefOr[SchemaFieldDescription | js.Array[SchemaFieldDescription]] = js.undefined
}
object SchemaInnerTypeDescription {
  
  inline def apply(
    notOneOf: js.Array[Any],
    nullable: Boolean,
    oneOf: js.Array[Any],
    optional: Boolean,
    tests: js.Array[Name],
    `type`: String
  ): SchemaInnerTypeDescription = {
    val __obj = js.Dynamic.literal(notOneOf = notOneOf.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInnerTypeDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchemaInnerTypeDescription] (val x: Self) extends AnyVal {
    
    inline def setInnerType(value: SchemaFieldDescription | js.Array[SchemaFieldDescription]): Self = StObject.set(x, "innerType", value.asInstanceOf[js.Any])
    
    inline def setInnerTypeUndefined: Self = StObject.set(x, "innerType", js.undefined)
    
    inline def setInnerTypeVarargs(value: SchemaFieldDescription*): Self = StObject.set(x, "innerType", js.Array(value*))
  }
}
