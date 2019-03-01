package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimepickerOptions extends js.Object {
  var autoclose: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined
  var collapse: js.UndefOr[scala.Boolean] = js.undefined
  var daysOfWeekDisabled: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var defaultDate: js.UndefOr[stdLib.Date | java.lang.String | js.Any] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var disabledDates: js.UndefOr[js.Array[stdLib.Date | java.lang.String | js.Object]] = js.undefined
  var enabledDates: js.UndefOr[js.Array[stdLib.Date | java.lang.String | js.Object]] = js.undefined
  var forceParse: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var icons: js.UndefOr[DatetimepickerIcons] = js.undefined
  var ignoreReadonly: js.UndefOr[scala.Boolean] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxDate: js.UndefOr[stdLib.Date | java.lang.String | js.Any] = js.undefined
  var maxView: js.UndefOr[scala.Double] = js.undefined
  var minDate: js.UndefOr[stdLib.Date | java.lang.String | js.Any] = js.undefined
  var minView: js.UndefOr[scala.Double] = js.undefined
  var minuteStepping: js.UndefOr[scala.Double] = js.undefined
  var pickDate: js.UndefOr[scala.Boolean] = js.undefined
  var pickTime: js.UndefOr[scala.Boolean] = js.undefined
  var showClear: js.UndefOr[scala.Boolean] = js.undefined
  var showMeridian: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
  var showTodayButton: js.UndefOr[scala.Boolean] = js.undefined
  var sideBySide: js.UndefOr[scala.Boolean] = js.undefined
  var startView: js.UndefOr[scala.Double] = js.undefined
  var todayBtn: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var todayHighlight: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  var toolbarPlacement: js.UndefOr[java.lang.String] = js.undefined
  var useCurrent: js.UndefOr[scala.Boolean] = js.undefined
  var useMinutes: js.UndefOr[scala.Boolean] = js.undefined
  var useSeconds: js.UndefOr[scala.Boolean] = js.undefined
  var useStrict: js.UndefOr[scala.Boolean] = js.undefined
  var viewMode: js.UndefOr[java.lang.String] = js.undefined
  var weekStart: js.UndefOr[scala.Double] = js.undefined
}

object DatetimepickerOptions {
  @scala.inline
  def apply(
    autoclose: scala.Double | scala.Boolean = null,
    calendarWeeks: js.UndefOr[scala.Boolean] = js.undefined,
    collapse: js.UndefOr[scala.Boolean] = js.undefined,
    daysOfWeekDisabled: js.Array[scala.Double] = null,
    defaultDate: stdLib.Date | java.lang.String | js.Any = null,
    direction: java.lang.String = null,
    disabledDates: js.Array[stdLib.Date | java.lang.String | js.Object] = null,
    enabledDates: js.Array[stdLib.Date | java.lang.String | js.Object] = null,
    forceParse: scala.Double | scala.Boolean = null,
    format: java.lang.String | scala.Boolean = null,
    icons: DatetimepickerIcons = null,
    ignoreReadonly: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    locale: java.lang.String = null,
    maxDate: stdLib.Date | java.lang.String | js.Any = null,
    maxView: scala.Int | scala.Double = null,
    minDate: stdLib.Date | java.lang.String | js.Any = null,
    minView: scala.Int | scala.Double = null,
    minuteStepping: scala.Int | scala.Double = null,
    pickDate: js.UndefOr[scala.Boolean] = js.undefined,
    pickTime: js.UndefOr[scala.Boolean] = js.undefined,
    showClear: js.UndefOr[scala.Boolean] = js.undefined,
    showMeridian: scala.Boolean | scala.Double = null,
    showToday: js.UndefOr[scala.Boolean] = js.undefined,
    showTodayButton: js.UndefOr[scala.Boolean] = js.undefined,
    sideBySide: js.UndefOr[scala.Boolean] = js.undefined,
    startView: scala.Int | scala.Double = null,
    todayBtn: scala.Double | scala.Boolean = null,
    todayHighlight: scala.Double | scala.Boolean = null,
    toolbarPlacement: java.lang.String = null,
    useCurrent: js.UndefOr[scala.Boolean] = js.undefined,
    useMinutes: js.UndefOr[scala.Boolean] = js.undefined,
    useSeconds: js.UndefOr[scala.Boolean] = js.undefined,
    useStrict: js.UndefOr[scala.Boolean] = js.undefined,
    viewMode: java.lang.String = null,
    weekStart: scala.Int | scala.Double = null
  ): DatetimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (autoclose != null) __obj.updateDynamic("autoclose")(autoclose.asInstanceOf[js.Any])
    if (!js.isUndefined(calendarWeeks)) __obj.updateDynamic("calendarWeeks")(calendarWeeks)
    if (!js.isUndefined(collapse)) __obj.updateDynamic("collapse")(collapse)
    if (daysOfWeekDisabled != null) __obj.updateDynamic("daysOfWeekDisabled")(daysOfWeekDisabled)
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates)
    if (enabledDates != null) __obj.updateDynamic("enabledDates")(enabledDates)
    if (forceParse != null) __obj.updateDynamic("forceParse")(forceParse.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (!js.isUndefined(ignoreReadonly)) __obj.updateDynamic("ignoreReadonly")(ignoreReadonly)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (language != null) __obj.updateDynamic("language")(language)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxView != null) __obj.updateDynamic("maxView")(maxView.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minView != null) __obj.updateDynamic("minView")(minView.asInstanceOf[js.Any])
    if (minuteStepping != null) __obj.updateDynamic("minuteStepping")(minuteStepping.asInstanceOf[js.Any])
    if (!js.isUndefined(pickDate)) __obj.updateDynamic("pickDate")(pickDate)
    if (!js.isUndefined(pickTime)) __obj.updateDynamic("pickTime")(pickTime)
    if (!js.isUndefined(showClear)) __obj.updateDynamic("showClear")(showClear)
    if (showMeridian != null) __obj.updateDynamic("showMeridian")(showMeridian.asInstanceOf[js.Any])
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday)
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton)
    if (!js.isUndefined(sideBySide)) __obj.updateDynamic("sideBySide")(sideBySide)
    if (startView != null) __obj.updateDynamic("startView")(startView.asInstanceOf[js.Any])
    if (todayBtn != null) __obj.updateDynamic("todayBtn")(todayBtn.asInstanceOf[js.Any])
    if (todayHighlight != null) __obj.updateDynamic("todayHighlight")(todayHighlight.asInstanceOf[js.Any])
    if (toolbarPlacement != null) __obj.updateDynamic("toolbarPlacement")(toolbarPlacement)
    if (!js.isUndefined(useCurrent)) __obj.updateDynamic("useCurrent")(useCurrent)
    if (!js.isUndefined(useMinutes)) __obj.updateDynamic("useMinutes")(useMinutes)
    if (!js.isUndefined(useSeconds)) __obj.updateDynamic("useSeconds")(useSeconds)
    if (!js.isUndefined(useStrict)) __obj.updateDynamic("useStrict")(useStrict)
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode)
    if (weekStart != null) __obj.updateDynamic("weekStart")(weekStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatetimepickerOptions]
  }
}

