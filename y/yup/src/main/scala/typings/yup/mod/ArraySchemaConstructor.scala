package typings.yup.mod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySchemaConstructor
  extends AnySchemaConstructor
     with // tslint:disable-next-line:no-unnecessary-generics
Instantiable0[NotRequiredArraySchema[js.Object, js.Object]] {
  
  def apply[T, C](): NotRequiredArraySchema[T, C] = js.native
  def apply[T, C](schema: Schema[T, C]): NotRequiredArraySchema[T, C] = js.native
}
