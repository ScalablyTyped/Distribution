package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object array {
  
  inline def apply[C /* <: Maybe[AnyObject] */, T](): ArraySchema[js.UndefOr[js.Array[T]], C, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ArraySchema[js.UndefOr[js.Array[T]], C, Unit, _empty]]
  inline def apply[C /* <: Maybe[AnyObject] */, T](`type`: ISchema[T, C, Any, Any]): ArraySchema[js.UndefOr[js.Array[T]], C, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any]).asInstanceOf[ArraySchema[js.UndefOr[js.Array[T]], C, Unit, _empty]]
  
  @JSImport("yup", "array")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "array.prototype")
  @js.native
  def prototype: ArraySchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: ArraySchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
