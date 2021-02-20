package typings.zui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatetimepickerOptions extends StObject {
  
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
  implicit class DatetimepickerOptionsMutableBuilder[Self <: DatetimepickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoclose(value: Double | Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    @scala.inline
    def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
    
    @scala.inline
    def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabled(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
    
    @scala.inline
    def setDaysOfWeekDisabledVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value :_*))
    
    @scala.inline
    def setDefaultDate(value: Date | String | js.Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDisabledDates(value: js.Array[Date | String | js.Object]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
    
    @scala.inline
    def setDisabledDatesVarargs(value: (Date | String | js.Object)*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
    
    @scala.inline
    def setEnabledDates(value: js.Array[Date | String | js.Object]): Self = StObject.set(x, "enabledDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledDatesUndefined: Self = StObject.set(x, "enabledDates", js.undefined)
    
    @scala.inline
    def setEnabledDatesVarargs(value: (Date | String | js.Object)*): Self = StObject.set(x, "enabledDates", js.Array(value :_*))
    
    @scala.inline
    def setForceParse(value: Double | Boolean): Self = StObject.set(x, "forceParse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceParseUndefined: Self = StObject.set(x, "forceParse", js.undefined)
    
    @scala.inline
    def setFormat(value: String | Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIcons(value: DatetimepickerIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setIgnoreReadonly(value: Boolean): Self = StObject.set(x, "ignoreReadonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreReadonlyUndefined: Self = StObject.set(x, "ignoreReadonly", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String | js.Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMaxView(value: Double): Self = StObject.set(x, "maxView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxViewUndefined: Self = StObject.set(x, "maxView", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String | js.Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMinView(value: Double): Self = StObject.set(x, "minView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinViewUndefined: Self = StObject.set(x, "minView", js.undefined)
    
    @scala.inline
    def setMinuteStepping(value: Double): Self = StObject.set(x, "minuteStepping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteSteppingUndefined: Self = StObject.set(x, "minuteStepping", js.undefined)
    
    @scala.inline
    def setPickDate(value: Boolean): Self = StObject.set(x, "pickDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickDateUndefined: Self = StObject.set(x, "pickDate", js.undefined)
    
    @scala.inline
    def setPickTime(value: Boolean): Self = StObject.set(x, "pickTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickTimeUndefined: Self = StObject.set(x, "pickTime", js.undefined)
    
    @scala.inline
    def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
    
    @scala.inline
    def setShowMeridian(value: Boolean | Double): Self = StObject.set(x, "showMeridian", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMeridianUndefined: Self = StObject.set(x, "showMeridian", js.undefined)
    
    @scala.inline
    def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
    
    @scala.inline
    def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
    
    @scala.inline
    def setSideBySide(value: Boolean): Self = StObject.set(x, "sideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideBySideUndefined: Self = StObject.set(x, "sideBySide", js.undefined)
    
    @scala.inline
    def setStartView(value: Double): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
    
    @scala.inline
    def setTodayBtn(value: Double | Boolean): Self = StObject.set(x, "todayBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodayBtnUndefined: Self = StObject.set(x, "todayBtn", js.undefined)
    
    @scala.inline
    def setTodayHighlight(value: Double | Boolean): Self = StObject.set(x, "todayHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTodayHighlightUndefined: Self = StObject.set(x, "todayHighlight", js.undefined)
    
    @scala.inline
    def setToolbarPlacement(value: String): Self = StObject.set(x, "toolbarPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarPlacementUndefined: Self = StObject.set(x, "toolbarPlacement", js.undefined)
    
    @scala.inline
    def setUseCurrent(value: Boolean): Self = StObject.set(x, "useCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCurrentUndefined: Self = StObject.set(x, "useCurrent", js.undefined)
    
    @scala.inline
    def setUseMinutes(value: Boolean): Self = StObject.set(x, "useMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMinutesUndefined: Self = StObject.set(x, "useMinutes", js.undefined)
    
    @scala.inline
    def setUseSeconds(value: Boolean): Self = StObject.set(x, "useSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSecondsUndefined: Self = StObject.set(x, "useSeconds", js.undefined)
    
    @scala.inline
    def setUseStrict(value: Boolean): Self = StObject.set(x, "useStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStrictUndefined: Self = StObject.set(x, "useStrict", js.undefined)
    
    @scala.inline
    def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    
    @scala.inline
    def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
  }
}
