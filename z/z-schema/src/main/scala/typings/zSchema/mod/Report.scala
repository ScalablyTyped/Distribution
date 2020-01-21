package typings.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic representation of the Report class -- just enough to support customValidator
  */
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
  ): Unit
}

object Report {
  @scala.inline
  def apply(addCustomError: (String, String, js.Array[String], String, String) => Unit): Report = {
    val __obj = js.Dynamic.literal(addCustomError = js.Any.fromFunction5(addCustomError))
  
    __obj.asInstanceOf[Report]
  }
}

