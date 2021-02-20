package typings.yup.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectSchemaConstructor
  extends AnySchemaConstructor
     with // tslint:disable-next-line:no-unnecessary-generics
Instantiable0[ObjectSchema[js.Object, js.Object]] {
  
  def apply[T /* <: js.Object */, C](): ObjectSchema[js.UndefOr[T], C] = js.native
  def apply[T /* <: js.Object */, C](fields: ObjectSchemaDefinition[T, C]): ObjectSchema[js.UndefOr[T], C] = js.native
}
