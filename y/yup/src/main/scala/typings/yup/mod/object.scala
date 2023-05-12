package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `object` {
  
  inline def apply[C /* <: Maybe[AnyObject] */, S /* <: ObjectShape */](): ObjectSchema[_underscore[TypeFromShape[S, C]], C, _underscore[DefaultFromShape[S]], _empty] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ObjectSchema[_underscore[TypeFromShape[S, C]], C, _underscore[DefaultFromShape[S]], _empty]]
  inline def apply[C /* <: Maybe[AnyObject] */, S /* <: ObjectShape */](spec: S): ObjectSchema[_underscore[TypeFromShape[S, C]], C, _underscore[DefaultFromShape[S]], _empty] = ^.asInstanceOf[js.Dynamic].apply(spec.asInstanceOf[js.Any]).asInstanceOf[ObjectSchema[_underscore[TypeFromShape[S, C]], C, _underscore[DefaultFromShape[S]], _empty]]
  
  @JSImport("yup", "object")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "object.prototype")
  @js.native
  def prototype: ObjectSchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: ObjectSchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
