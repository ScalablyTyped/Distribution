package typings.yup.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yup", "ValidationError")
@js.native
open class ValidationError protected ()
  extends StObject
     with Error {
  def this(errorOrErrors: String) = this()
  def this(errorOrErrors: js.Array[ValidationError]) = this()
  def this(errorOrErrors: ValidationError) = this()
  def this(errorOrErrors: String, value: Any) = this()
  def this(errorOrErrors: js.Array[ValidationError], value: Any) = this()
  def this(errorOrErrors: ValidationError, value: Any) = this()
  def this(errorOrErrors: String, value: Any, field: String) = this()
  def this(errorOrErrors: String, value: Unit, field: String) = this()
  def this(errorOrErrors: js.Array[ValidationError], value: Any, field: String) = this()
  def this(errorOrErrors: js.Array[ValidationError], value: Unit, field: String) = this()
  def this(errorOrErrors: ValidationError, value: Any, field: String) = this()
  def this(errorOrErrors: ValidationError, value: Unit, field: String) = this()
  def this(errorOrErrors: String, value: Any, field: String, `type`: String) = this()
  def this(errorOrErrors: String, value: Any, field: Unit, `type`: String) = this()
  def this(errorOrErrors: String, value: Unit, field: String, `type`: String) = this()
  def this(errorOrErrors: String, value: Unit, field: Unit, `type`: String) = this()
  def this(errorOrErrors: js.Array[ValidationError], value: Any, field: String, `type`: String) = this()
  def this(errorOrErrors: js.Array[ValidationError], value: Any, field: Unit, `type`: String) = this()
  def this(errorOrErrors: js.Array[ValidationError], value: Unit, field: String, `type`: String) = this()
  def this(errorOrErrors: js.Array[ValidationError], value: Unit, field: Unit, `type`: String) = this()
  def this(errorOrErrors: ValidationError, value: Any, field: String, `type`: String) = this()
  def this(errorOrErrors: ValidationError, value: Any, field: Unit, `type`: String) = this()
  def this(errorOrErrors: ValidationError, value: Unit, field: String, `type`: String) = this()
  def this(errorOrErrors: ValidationError, value: Unit, field: Unit, `type`: String) = this()
  
  var errors: js.Array[String] = js.native
  
  var inner: js.Array[ValidationError] = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var params: js.UndefOr[Params] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: Any = js.native
}
object ValidationError {
  
  @JSImport("yup", "ValidationError")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def formatError(message: String, params: Params): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(message.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatError(message: js.Function1[/* params */ Params, String], params: Params): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(message.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatError(message: Any, params: Params): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(message.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def isError(err: Any): /* is yup.yup.ValidationError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(err.asInstanceOf[js.Any]).asInstanceOf[/* is yup.yup.ValidationError */ Boolean]
}
