package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestContext[TContext] extends StObject {
  
  def createError(): ValidationError = js.native
  def createError(params: CreateErrorOptions): ValidationError = js.native
  
  var from: js.UndefOr[js.Array[typings.yup.anon.Schema[TContext]]] = js.native
  
  var options: ValidateOptions[TContext] = js.native
  
  var originalValue: Any = js.native
  
  var parent: Any = js.native
  
  var path: String = js.native
  
  def resolve[T](value: T): T = js.native
  def resolve[T](value: Reference[T]): T = js.native
  
  var schema: Any = js.native
}
