package typings.yup.mod

import typings.yup.anon.Name
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
  implicit class SchemaFieldInnerTypeDescriptionOps[Self <: SchemaFieldInnerTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestsVarargs(value: Name*): Self = this.set("tests", js.Array(value :_*))
    
    @scala.inline
    def setTests(value: js.Array[Name]): Self = this.set("tests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerType(value: SchemaFieldDescription): Self = this.set("innerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerType: Self = this.set("innerType", js.undefined)
  }
}
