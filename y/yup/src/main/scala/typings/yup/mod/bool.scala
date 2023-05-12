package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bool {
  
  inline def apply(): BooleanSchema[js.UndefOr[Boolean], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[BooleanSchema[js.UndefOr[Boolean], AnyObject, Unit, _empty]]
  
  @JSImport("yup", "bool")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "bool.prototype")
  @js.native
  def prototype: BooleanSchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: BooleanSchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
