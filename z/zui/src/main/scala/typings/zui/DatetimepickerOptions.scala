package typings.zui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatetimepickerOptions extends js.Object {
  
  var autoclose: js.UndefOr[Double | Boolean] = js.native
  
  var calendarWeeks: js.UndefOr[Boolean] = js.native
  
  var collapse: js.UndefOr[Boolean] = js.native
  
  var daysOfWeekDisabled: js.UndefOr[js.Array[Double]] = js.native
  
  var defaultDate: js.UndefOr[Date | String | js.Any] = js.native
  
  var direction: js.UndefOr[String] = js.native
  
  var disabledDates: js.UndefOr[js.Array[Date | String | js.Object]] = js.native
  
  var enabledDates: js.UndefOr[js.Array[Date | String | js.Object]] = js.native
  
  var forceParse: js.UndefOr[Double | Boolean] = js.native
  
  var format: js.UndefOr[String | Boolean] = js.native
  
  var icons: js.UndefOr[DatetimepickerIcons] = js.native
  
  var ignoreReadonly: js.UndefOr[Boolean] = js.native
  
  var `inline`: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[Date | String | js.Any] = js.native
  
  var maxView: js.UndefOr[Double] = js.native
  
  var minDate: js.UndefOr[Date | String | js.Any] = js.native
  
  var minView: js.UndefOr[Double] = js.native
  
  var minuteStepping: js.UndefOr[Double] = js.native
  
  var pickDate: js.UndefOr[Boolean] = js.native
  
  var pickTime: js.UndefOr[Boolean] = js.native
  
  var showClear: js.UndefOr[Boolean] = js.native
  
  var showMeridian: js.UndefOr[Boolean | Double] = js.native
  
  var showToday: js.UndefOr[Boolean] = js.native
  
  var showTodayButton: js.UndefOr[Boolean] = js.native
  
  var sideBySide: js.UndefOr[Boolean] = js.native
  
  var startView: js.UndefOr[Double] = js.native
  
  var todayBtn: js.UndefOr[Double | Boolean] = js.native
  
  var todayHighlight: js.UndefOr[Double | Boolean] = js.native
  
  var toolbarPlacement: js.UndefOr[String] = js.native
  
  var useCurrent: js.UndefOr[Boolean] = js.native
  
  var useMinutes: js.UndefOr[Boolean] = js.native
  
  var useSeconds: js.UndefOr[Boolean] = js.native
  
  var useStrict: js.UndefOr[Boolean] = js.native
  
  var viewMode: js.UndefOr[String] = js.native
  
  var weekStart: js.UndefOr[Double] = js.native
}
object DatetimepickerOptions {
  
  @scala.inline
  def apply(): DatetimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimepickerOptions]
  }
  
  @scala.inline
  implicit class DatetimepickerOptionsOps[Self <: DatetimepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoclose(value: Double | Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = this.set("calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWeeks: Self = this.set("calendarWeeks", js.undefined)
    
    @scala.inline
    def setCollapse(value: Boolean): Self = this.set("collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapse: Self = this.set("collapse", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabledVarargs(value: Double*): Self = this.set("daysOfWeekDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDaysOfWeekDisabled(value: js.Array[Double]): Self = this.set("daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaysOfWeekDisabled: Self = this.set("daysOfWeekDisabled", js.undefined)
    
    @scala.inline
    def setDefaultDate(value: Date | String | js.Any): Self = this.set("defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDate: Self = this.set("defaultDate", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: (Date | String | js.Object)*): Self = this.set("disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setDisabledDates(value: js.Array[Date | String | js.Object]): Self = this.set("disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledDates: Self = this.set("disabledDates", js.undefined)
    
    @scala.inline
    def setEnabledDatesVarargs(value: (Date | String | js.Object)*): Self = this.set("enabledDates", js.Array(value :_*))
    
    @scala.inline
    def setEnabledDates(value: js.Array[Date | String | js.Object]): Self = this.set("enabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledDates: Self = this.set("enabledDates", js.undefined)
    
    @scala.inline
    def setForceParse(value: Double | Boolean): Self = this.set("forceParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceParse: Self = this.set("forceParse", js.undefined)
    
    @scala.inline
    def setFormat(value: String | Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIcons(value: DatetimepickerIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIgnoreReadonly(value: Boolean): Self = this.set("ignoreReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreReadonly: Self = this.set("ignoreReadonly", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String | js.Any): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMaxView(value: Double): Self = this.set("maxView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxView: Self = this.set("maxView", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String | js.Any): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinView(value: Double): Self = this.set("minView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinView: Self = this.set("minView", js.undefined)
    
    @scala.inline
    def setMinuteStepping(value: Double): Self = this.set("minuteStepping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteStepping: Self = this.set("minuteStepping", js.undefined)
    
    @scala.inline
    def setPickDate(value: Boolean): Self = this.set("pickDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickDate: Self = this.set("pickDate", js.undefined)
    
    @scala.inline
    def setPickTime(value: Boolean): Self = this.set("pickTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePickTime: Self = this.set("pickTime", js.undefined)
    
    @scala.inline
    def setShowClear(value: Boolean): Self = this.set("showClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowClear: Self = this.set("showClear", js.undefined)
    
    @scala.inline
    def setShowMeridian(value: Boolean | Double): Self = this.set("showMeridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMeridian: Self = this.set("showMeridian", js.undefined)
    
    @scala.inline
    def setShowToday(value: Boolean): Self = this.set("showToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToday: Self = this.set("showToday", js.undefined)
    
    @scala.inline
    def setShowTodayButton(value: Boolean): Self = this.set("showTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTodayButton: Self = this.set("showTodayButton", js.undefined)
    
    @scala.inline
    def setSideBySide(value: Boolean): Self = this.set("sideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideBySide: Self = this.set("sideBySide", js.undefined)
    
    @scala.inline
    def setStartView(value: Double): Self = this.set("startView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartView: Self = this.set("startView", js.undefined)
    
    @scala.inline
    def setTodayBtn(value: Double | Boolean): Self = this.set("todayBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayBtn: Self = this.set("todayBtn", js.undefined)
    
    @scala.inline
    def setTodayHighlight(value: Double | Boolean): Self = this.set("todayHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayHighlight: Self = this.set("todayHighlight", js.undefined)
    
    @scala.inline
    def setToolbarPlacement(value: String): Self = this.set("toolbarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarPlacement: Self = this.set("toolbarPlacement", js.undefined)
    
    @scala.inline
    def setUseCurrent(value: Boolean): Self = this.set("useCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCurrent: Self = this.set("useCurrent", js.undefined)
    
    @scala.inline
    def setUseMinutes(value: Boolean): Self = this.set("useMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMinutes: Self = this.set("useMinutes", js.undefined)
    
    @scala.inline
    def setUseSeconds(value: Boolean): Self = this.set("useSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSeconds: Self = this.set("useSeconds", js.undefined)
    
    @scala.inline
    def setUseStrict(value: Boolean): Self = this.set("useStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseStrict: Self = this.set("useStrict", js.undefined)
    
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
    
    @scala.inline
    def setWeekStart(value: Double): Self = this.set("weekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStart: Self = this.set("weekStart", js.undefined)
  }
}
