package typings.zui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimepickerOptions extends js.Object {
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
  @scala.inline
  def apply(
    autoclose: Double | Boolean = null,
    calendarWeeks: js.UndefOr[Boolean] = js.undefined,
    collapse: js.UndefOr[Boolean] = js.undefined,
    daysOfWeekDisabled: js.Array[Double] = null,
    defaultDate: Date | String | js.Any = null,
    direction: String = null,
    disabledDates: js.Array[Date | String | js.Object] = null,
    enabledDates: js.Array[Date | String | js.Object] = null,
    forceParse: Double | Boolean = null,
    format: String | Boolean = null,
    icons: DatetimepickerIcons = null,
    ignoreReadonly: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    locale: String = null,
    maxDate: Date | String | js.Any = null,
    maxView: Int | Double = null,
    minDate: Date | String | js.Any = null,
    minView: Int | Double = null,
    minuteStepping: Int | Double = null,
    pickDate: js.UndefOr[Boolean] = js.undefined,
    pickTime: js.UndefOr[Boolean] = js.undefined,
    showClear: js.UndefOr[Boolean] = js.undefined,
    showMeridian: Boolean | Double = null,
    showToday: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    sideBySide: js.UndefOr[Boolean] = js.undefined,
    startView: Int | Double = null,
    todayBtn: Double | Boolean = null,
    todayHighlight: Double | Boolean = null,
    toolbarPlacement: String = null,
    useCurrent: js.UndefOr[Boolean] = js.undefined,
    useMinutes: js.UndefOr[Boolean] = js.undefined,
    useSeconds: js.UndefOr[Boolean] = js.undefined,
    useStrict: js.UndefOr[Boolean] = js.undefined,
    viewMode: String = null,
    weekStart: Int | Double = null
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

