package typings.zui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatetimepickerOptions extends StObject {
  
  var autoclose: js.UndefOr[Double | Boolean] = js.undefined
  
  var calendarWeeks: js.UndefOr[Boolean] = js.undefined
  
  var collapse: js.UndefOr[Boolean] = js.undefined
  
  var daysOfWeekDisabled: js.UndefOr[js.Array[Double]] = js.undefined
  
  var defaultDate: js.UndefOr[Date | String | js.Any] = js.undefined
  
  var direction: js.UndefOr[String] = js.undefined
  
  var disabledDates: js.UndefOr[js.Array[Date | String | js.Object]] = js.undefined
  
  var enabledDates: js.UndefOr[js.Array[Date | String | js.Object]] = js.undefined
  
  var forceParse: js.UndefOr[Double | Boolean] = js.undefined
  
  var format: js.UndefOr[String | Boolean] = js.undefined
  
  var icons: js.UndefOr[DatetimepickerIcons] = js.undefined
  
  var ignoreReadonly: js.UndefOr[Boolean] = js.undefined
  
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var maxDate: js.UndefOr[Date | String | js.Any] = js.undefined
  
  var maxView: js.UndefOr[Double] = js.undefined
  
  var minDate: js.UndefOr[Date | String | js.Any] = js.undefined
  
  var minView: js.UndefOr[Double] = js.undefined
  
  var minuteStepping: js.UndefOr[Double] = js.undefined
  
  var pickDate: js.UndefOr[Boolean] = js.undefined
  
  var pickTime: js.UndefOr[Boolean] = js.undefined
  
  var showClear: js.UndefOr[Boolean] = js.undefined
  
  var showMeridian: js.UndefOr[Boolean | Double] = js.undefined
  
  var showToday: js.UndefOr[Boolean] = js.undefined
  
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  
  var sideBySide: js.UndefOr[Boolean] = js.undefined
  
  var startView: js.UndefOr[Double] = js.undefined
  
  var todayBtn: js.UndefOr[Double | Boolean] = js.undefined
  
  var todayHighlight: js.UndefOr[Double | Boolean] = js.undefined
  
  var toolbarPlacement: js.UndefOr[String] = js.undefined
  
  var useCurrent: js.UndefOr[Boolean] = js.undefined
  
  var useMinutes: js.UndefOr[Boolean] = js.undefined
  
  var useSeconds: js.UndefOr[Boolean] = js.undefined
  
  var useStrict: js.UndefOr[Boolean] = js.undefined
  
  var viewMode: js.UndefOr[String] = js.undefined
  
  var weekStart: js.UndefOr[Double] = js.undefined
}
object DatetimepickerOptions {
  
  inline def apply(): DatetimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimepickerOptions]
  }
  
  extension [Self <: DatetimepickerOptions](x: Self) {
    
    inline def setAutoclose(value: Double | Boolean): Self = StObject.set(x, "autoclose", value.asInstanceOf[js.Any])
    
    inline def setAutocloseUndefined: Self = StObject.set(x, "autoclose", js.undefined)
    
    inline def setCalendarWeeks(value: Boolean): Self = StObject.set(x, "calendarWeeks", value.asInstanceOf[js.Any])
    
    inline def setCalendarWeeksUndefined: Self = StObject.set(x, "calendarWeeks", js.undefined)
    
    inline def setCollapse(value: Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setDaysOfWeekDisabled(value: js.Array[Double]): Self = StObject.set(x, "daysOfWeekDisabled", value.asInstanceOf[js.Any])
    
    inline def setDaysOfWeekDisabledUndefined: Self = StObject.set(x, "daysOfWeekDisabled", js.undefined)
    
    inline def setDaysOfWeekDisabledVarargs(value: Double*): Self = StObject.set(x, "daysOfWeekDisabled", js.Array(value :_*))
    
    inline def setDefaultDate(value: Date | String | js.Any): Self = StObject.set(x, "defaultDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultDateUndefined: Self = StObject.set(x, "defaultDate", js.undefined)
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDisabledDates(value: js.Array[Date | String | js.Object]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
    
    inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
    
    inline def setDisabledDatesVarargs(value: (Date | String | js.Object)*): Self = StObject.set(x, "disabledDates", js.Array(value :_*))
    
    inline def setEnabledDates(value: js.Array[Date | String | js.Object]): Self = StObject.set(x, "enabledDates", value.asInstanceOf[js.Any])
    
    inline def setEnabledDatesUndefined: Self = StObject.set(x, "enabledDates", js.undefined)
    
    inline def setEnabledDatesVarargs(value: (Date | String | js.Object)*): Self = StObject.set(x, "enabledDates", js.Array(value :_*))
    
    inline def setForceParse(value: Double | Boolean): Self = StObject.set(x, "forceParse", value.asInstanceOf[js.Any])
    
    inline def setForceParseUndefined: Self = StObject.set(x, "forceParse", js.undefined)
    
    inline def setFormat(value: String | Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIcons(value: DatetimepickerIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setIgnoreReadonly(value: Boolean): Self = StObject.set(x, "ignoreReadonly", value.asInstanceOf[js.Any])
    
    inline def setIgnoreReadonlyUndefined: Self = StObject.set(x, "ignoreReadonly", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMaxDate(value: Date | String | js.Any): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMaxView(value: Double): Self = StObject.set(x, "maxView", value.asInstanceOf[js.Any])
    
    inline def setMaxViewUndefined: Self = StObject.set(x, "maxView", js.undefined)
    
    inline def setMinDate(value: Date | String | js.Any): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMinView(value: Double): Self = StObject.set(x, "minView", value.asInstanceOf[js.Any])
    
    inline def setMinViewUndefined: Self = StObject.set(x, "minView", js.undefined)
    
    inline def setMinuteStepping(value: Double): Self = StObject.set(x, "minuteStepping", value.asInstanceOf[js.Any])
    
    inline def setMinuteSteppingUndefined: Self = StObject.set(x, "minuteStepping", js.undefined)
    
    inline def setPickDate(value: Boolean): Self = StObject.set(x, "pickDate", value.asInstanceOf[js.Any])
    
    inline def setPickDateUndefined: Self = StObject.set(x, "pickDate", js.undefined)
    
    inline def setPickTime(value: Boolean): Self = StObject.set(x, "pickTime", value.asInstanceOf[js.Any])
    
    inline def setPickTimeUndefined: Self = StObject.set(x, "pickTime", js.undefined)
    
    inline def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
    
    inline def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
    
    inline def setShowMeridian(value: Boolean | Double): Self = StObject.set(x, "showMeridian", value.asInstanceOf[js.Any])
    
    inline def setShowMeridianUndefined: Self = StObject.set(x, "showMeridian", js.undefined)
    
    inline def setShowToday(value: Boolean): Self = StObject.set(x, "showToday", value.asInstanceOf[js.Any])
    
    inline def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
    
    inline def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
    
    inline def setShowTodayUndefined: Self = StObject.set(x, "showToday", js.undefined)
    
    inline def setSideBySide(value: Boolean): Self = StObject.set(x, "sideBySide", value.asInstanceOf[js.Any])
    
    inline def setSideBySideUndefined: Self = StObject.set(x, "sideBySide", js.undefined)
    
    inline def setStartView(value: Double): Self = StObject.set(x, "startView", value.asInstanceOf[js.Any])
    
    inline def setStartViewUndefined: Self = StObject.set(x, "startView", js.undefined)
    
    inline def setTodayBtn(value: Double | Boolean): Self = StObject.set(x, "todayBtn", value.asInstanceOf[js.Any])
    
    inline def setTodayBtnUndefined: Self = StObject.set(x, "todayBtn", js.undefined)
    
    inline def setTodayHighlight(value: Double | Boolean): Self = StObject.set(x, "todayHighlight", value.asInstanceOf[js.Any])
    
    inline def setTodayHighlightUndefined: Self = StObject.set(x, "todayHighlight", js.undefined)
    
    inline def setToolbarPlacement(value: String): Self = StObject.set(x, "toolbarPlacement", value.asInstanceOf[js.Any])
    
    inline def setToolbarPlacementUndefined: Self = StObject.set(x, "toolbarPlacement", js.undefined)
    
    inline def setUseCurrent(value: Boolean): Self = StObject.set(x, "useCurrent", value.asInstanceOf[js.Any])
    
    inline def setUseCurrentUndefined: Self = StObject.set(x, "useCurrent", js.undefined)
    
    inline def setUseMinutes(value: Boolean): Self = StObject.set(x, "useMinutes", value.asInstanceOf[js.Any])
    
    inline def setUseMinutesUndefined: Self = StObject.set(x, "useMinutes", js.undefined)
    
    inline def setUseSeconds(value: Boolean): Self = StObject.set(x, "useSeconds", value.asInstanceOf[js.Any])
    
    inline def setUseSecondsUndefined: Self = StObject.set(x, "useSeconds", js.undefined)
    
    inline def setUseStrict(value: Boolean): Self = StObject.set(x, "useStrict", value.asInstanceOf[js.Any])
    
    inline def setUseStrictUndefined: Self = StObject.set(x, "useStrict", js.undefined)
    
    inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    
    inline def setWeekStart(value: Double): Self = StObject.set(x, "weekStart", value.asInstanceOf[js.Any])
    
    inline def setWeekStartUndefined: Self = StObject.set(x, "weekStart", js.undefined)
  }
}
