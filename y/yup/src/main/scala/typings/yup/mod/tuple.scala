package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tuple {
  
  inline def apply[T /* <: AnyTuple */](
    schemas: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: yup.yup.ISchema<T[K], any, any, any>} */ js.Any
  ): TupleSchema[js.UndefOr[T], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply(schemas.asInstanceOf[js.Any]).asInstanceOf[TupleSchema[js.UndefOr[T], AnyObject, Unit, _empty]]
  
  @JSImport("yup", "tuple")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "tuple.prototype")
  @js.native
  def prototype: TupleSchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: TupleSchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
