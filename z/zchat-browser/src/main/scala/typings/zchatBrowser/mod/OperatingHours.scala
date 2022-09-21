package typings.zchatBrowser.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.zchatBrowser.anon.typeaccountacountschedule
  - typings.zchatBrowser.anon.typedepartmentdepartments
*/
trait OperatingHours extends StObject
object OperatingHours {
  
  inline def typeaccountacountschedule(acount_schedule: Schedule, enabled: Boolean, timezone: String): typings.zchatBrowser.anon.typeaccountacountschedule = {
    val __obj = js.Dynamic.literal(acount_schedule = acount_schedule.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("account")
    __obj.asInstanceOf[typings.zchatBrowser.anon.typeaccountacountschedule]
  }
  
  inline def typedepartmentdepartments(department_schedule: NumberDictionary[Schedule], enabled: Boolean, timezone: String): typings.zchatBrowser.anon.typedepartmentdepartments = {
    val __obj = js.Dynamic.literal(department_schedule = department_schedule.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("department")
    __obj.asInstanceOf[typings.zchatBrowser.anon.typedepartmentdepartments]
  }
}
