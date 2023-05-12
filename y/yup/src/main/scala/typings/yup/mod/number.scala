package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object number {
  
  inline def apply(): NumberSchema[js.UndefOr[Double], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[NumberSchema[js.UndefOr[Double], AnyObject, Unit, _empty]]
  
  @JSImport("yup", "number")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "number.prototype")
  @js.native
  def prototype: NumberSchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: NumberSchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
