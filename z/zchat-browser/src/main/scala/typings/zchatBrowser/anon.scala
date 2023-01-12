package typings.zchatBrowser

import org.scalablytyped.runtime.NumberDictionary
import typings.zchatBrowser.mod.OperatingHours
import typings.zchatBrowser.mod.Schedule
import typings.zchatBrowser.zchatBrowserStrings.account
import typings.zchatBrowser.zchatBrowserStrings.department
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cleardeptidonchatended extends StObject {
    
    var clear_dept_id_on_chat_ended: js.UndefOr[Boolean] = js.undefined
  }
  object Cleardeptidonchatended {
    
    inline def apply(): Cleardeptidonchatended = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cleardeptidonchatended]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cleardeptidonchatended] (val x: Self) extends AnyVal {
      
      inline def setClear_dept_id_on_chat_ended(value: Boolean): Self = StObject.set(x, "clear_dept_id_on_chat_ended", value.asInstanceOf[js.Any])
      
      inline def setClear_dept_id_on_chat_endedUndefined: Self = StObject.set(x, "clear_dept_id_on_chat_ended", js.undefined)
    }
  }
  
  trait Comment extends StObject {
    
    var comment: String | Null
    
    var rating: String | Null
  }
  object Comment {
    
    inline def apply(): Comment = {
      val __obj = js.Dynamic.literal(comment = null, rating = null)
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentNull: Self = StObject.set(x, "comment", null)
      
      inline def setRating(value: String): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingNull: Self = StObject.set(x, "rating", null)
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var has_more: Boolean
  }
  object Count {
    
    inline def apply(count: Double, has_more: Boolean): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], has_more = has_more.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
    }
  }
  
  trait Jwtfn extends StObject {
    
    var jwt_fn: js.UndefOr[js.Function1[/* callback */ js.Function1[/* jwt */ String, Unit], Unit]] = js.undefined
  }
  object Jwtfn {
    
    inline def apply(): Jwtfn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Jwtfn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Jwtfn] (val x: Self) extends AnyVal {
      
      inline def setJwt_fn(value: /* callback */ js.Function1[/* jwt */ String, Unit] => Unit): Self = StObject.set(x, "jwt_fn", js.Any.fromFunction1(value))
      
      inline def setJwt_fnUndefined: Self = StObject.set(x, "jwt_fn", js.undefined)
    }
  }
  
  /* Inlined std.Partial<zchat-browser.zchat-browser.VisitorInfo> */
  trait PartialVisitorInfo extends StObject {
    
    var display_name: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
  }
  object PartialVisitorInfo {
    
    inline def apply(): PartialVisitorInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialVisitorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialVisitorInfo] (val x: Self) extends AnyVal {
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
  
  trait Title extends StObject {
    
    var title: String
    
    var url: String
  }
  object Title {
    
    inline def apply(title: String, url: String): Title = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :'account',   acount_schedule :zchat-browser.zchat-browser.Schedule} & {  enabled :boolean,   timezone :string} */
  trait typeaccountacountschedule
    extends StObject
       with OperatingHours {
    
    var acount_schedule: Schedule
    
    var enabled: Boolean
    
    var timezone: String
    
    var `type`: account
  }
  object typeaccountacountschedule {
    
    inline def apply(acount_schedule: Schedule, enabled: Boolean, timezone: String): typeaccountacountschedule = {
      val __obj = js.Dynamic.literal(acount_schedule = acount_schedule.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("account")
      __obj.asInstanceOf[typeaccountacountschedule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typeaccountacountschedule] (val x: Self) extends AnyVal {
      
      inline def setAcount_schedule(value: Schedule): Self = StObject.set(x, "acount_schedule", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setType(value: account): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  type :'department',   department_schedule :{[id: number] : zchat-browser.zchat-browser.Schedule}} & {  enabled :boolean,   timezone :string} */
  trait typedepartmentdepartments
    extends StObject
       with OperatingHours {
    
    var department_schedule: NumberDictionary[Schedule]
    
    var enabled: Boolean
    
    var timezone: String
    
    var `type`: department
  }
  object typedepartmentdepartments {
    
    inline def apply(department_schedule: NumberDictionary[Schedule], enabled: Boolean, timezone: String): typedepartmentdepartments = {
      val __obj = js.Dynamic.literal(department_schedule = department_schedule.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("department")
      __obj.asInstanceOf[typedepartmentdepartments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typedepartmentdepartments] (val x: Self) extends AnyVal {
      
      inline def setDepartment_schedule(value: NumberDictionary[Schedule]): Self = StObject.set(x, "department_schedule", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
      
      inline def setType(value: department): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
