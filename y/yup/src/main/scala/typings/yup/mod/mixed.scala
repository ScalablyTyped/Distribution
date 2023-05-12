package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixed {
  
  inline def apply[TType /* <: AnyPresentValue */](): MixedSchema[js.UndefOr[TType], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MixedSchema[js.UndefOr[TType], AnyObject, Unit, _empty]]
  inline def apply[TType /* <: AnyPresentValue */](spec: MixedOptions[TType]): MixedSchema[js.UndefOr[TType], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[MixedSchema[js.UndefOr[TType], AnyObject, Unit, _empty]]
  inline def apply[TType /* <: AnyPresentValue */](spec: TypeGuard[TType]): MixedSchema[js.UndefOr[TType], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[MixedSchema[js.UndefOr[TType], AnyObject, Unit, _empty]]
  
  @JSImport("yup", "mixed")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "mixed.prototype")
  @js.native
  def prototype: MixedSchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: MixedSchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
