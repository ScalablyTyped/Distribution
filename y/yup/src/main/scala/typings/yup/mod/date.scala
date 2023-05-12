package typings.yup.mod

import typings.yup.yupStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object date {
  
  inline def apply(): DateSchema[js.UndefOr[js.Date], AnyObject, Unit, _empty] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[DateSchema[js.UndefOr[js.Date], AnyObject, Unit, _empty]]
  
  @JSImport("yup", "date")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yup", "date.INVALID_DATE")
  @js.native
  def INVALID_DATE: js.Date = js.native
  inline def INVALID_DATE_=(x: js.Date): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_DATE")(x.asInstanceOf[js.Any])
  
  @JSImport("yup", "date.prototype")
  @js.native
  def prototype: DateSchema[Any, Any, Any, Any] = js.native
  inline def prototype_=(x: DateSchema[Any, Any, Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prototype")(x.asInstanceOf[js.Any])
}
