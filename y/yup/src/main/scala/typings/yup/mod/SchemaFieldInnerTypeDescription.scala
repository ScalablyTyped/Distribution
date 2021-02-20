package typings.yup.mod

import typings.yup.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<yup.yup.SchemaDescription, std.Exclude<keyof yup.yup.SchemaDescription, 'fields'>> */
@js.native
trait SchemaFieldInnerTypeDescription extends SchemaFieldDescription {
  
  var innerType: js.UndefOr[SchemaFieldDescription] = js.native
  
  var label: String = js.native
  
  var meta: js.Object = js.native
  
  var tests: js.Array[Name] = js.native
  
  var `type`: String = js.native
}
object SchemaFieldInnerTypeDescription {
  
  @scala.inline
  def apply(label: String, meta: js.Object, tests: js.Array[Name], `type`: String): SchemaFieldInnerTypeDescription = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldInnerTypeDescription]
  }
  
  @scala.inline
  implicit class SchemaFieldInnerTypeDescriptionMutableBuilder[Self <: SchemaFieldInnerTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInnerType(value: SchemaFieldDescription): Self = StObject.set(x, "innerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerTypeUndefined: Self = StObject.set(x, "innerType", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTests(value: js.Array[Name]): Self = StObject.set(x, "tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsVarargs(value: Name*): Self = StObject.set(x, "tests", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
