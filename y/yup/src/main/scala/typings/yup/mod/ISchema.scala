package typings.yup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISchema[T, C, F /* <: Flags */, D] extends StObject {
  
  var __context: C = js.native
  
  var __default: D = js.native
  
  var __flags: F = js.native
  
  var __outputType: T = js.native
  
  def asNestedTest(config: NestedTestConfig): Test = js.native
  
  def cast(value: Any): T = js.native
  def cast(value: Any, options: CastOptionalityOptions[C]): js.UndefOr[T | Null] = js.native
  def cast(value: Any, options: CastOptions1[C]): T = js.native
  
  def describe(): SchemaFieldDescription = js.native
  def describe(options: ResolveOptions[C]): SchemaFieldDescription = js.native
  
  def resolve(options: ResolveOptions[C]): ISchema[T, C, F, Any] = js.native
  
  def validate(value: Any): js.Promise[T] = js.native
  def validate(value: Any, options: ValidateOptions[C]): js.Promise[T] = js.native
}
