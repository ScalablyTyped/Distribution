package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaFieldRefDescription extends SchemaFieldDescription {
  
  var key: String = js.native
  
  var `type`: typings.yup.yupStrings.ref = js.native
}
object SchemaFieldRefDescription {
  
  @scala.inline
  def apply(key: String, `type`: typings.yup.yupStrings.ref): SchemaFieldRefDescription = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFieldRefDescription]
  }
  
  @scala.inline
  implicit class SchemaFieldRefDescriptionMutableBuilder[Self <: SchemaFieldRefDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.yup.yupStrings.ref): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
