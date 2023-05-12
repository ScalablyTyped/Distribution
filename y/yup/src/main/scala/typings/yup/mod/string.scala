package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object string {
  
  inline def apply(): StringSchema[js.UndefOr[String], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[StringSchema[js.UndefOr[String], AnyObject, Unit, _empty]]
  
  @JSImport("yup", "string")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "string.prototype")
  @js.native
  def prototype: StringSchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: StringSchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
