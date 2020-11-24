package typings.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Basic representation of the Report class -- just enough to support customValidator
  */
@js.native
trait Report extends js.Object {
  
  /**
    * @param errorCode - a string representing the code for the custom error, e.g. INVALID_VALUE_SET
    * @param errorMessage - string with the message to be returned in the error
    * @param params - an array of relevant params for the error, e.g. [fieldName, fieldValue]
    * @param subReports - sub-schema involved in the error
    * @param schemaDescription - description from the schema used in the validation
    * Adds custom error to the errors array in the validation instance and sets valid to false if it is not already set as false
    */
  def addCustomError(
    errorCode: String,
    errorMessage: String,
    params: js.Array[String],
    subReports: String,
    schemaDescription: String
  ): Unit = js.native
}
object Report {
  
  @scala.inline
  def apply(addCustomError: (String, String, js.Array[String], String, String) => Unit): Report = {
    val __obj = js.Dynamic.literal(addCustomError = js.Any.fromFunction5(addCustomError))
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    
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
    def setAddCustomError(value: (String, String, js.Array[String], String, String) => Unit): Self = this.set("addCustomError", js.Any.fromFunction5(value))
  }
}
