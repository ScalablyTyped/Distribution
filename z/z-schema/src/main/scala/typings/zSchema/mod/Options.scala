package typings.zSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assumeAdditional: js.UndefOr[Boolean] = js.undefined
  var asyncTimeout: js.UndefOr[Double] = js.undefined
  var breakOnFirstError: js.UndefOr[Boolean] = js.undefined
  var customValidator: js.UndefOr[js.Function3[/* report */ Report, /* schema */ js.Any, /* json */ js.Any, Unit]] = js.undefined
  var forceAdditional: js.UndefOr[Boolean] = js.undefined
  var forceItems: js.UndefOr[Boolean] = js.undefined
  var forceMaxItems: js.UndefOr[Boolean] = js.undefined
  var forceMaxLength: js.UndefOr[Boolean] = js.undefined
  var forceMinItems: js.UndefOr[Boolean] = js.undefined
  var forceMinLength: js.UndefOr[Boolean] = js.undefined
  var forceProperties: js.UndefOr[Boolean] = js.undefined
  var ignoreUnknownFormats: js.UndefOr[Boolean] = js.undefined
  var ignoreUnresolvableReferences: js.UndefOr[Boolean] = js.undefined
  var noEmptyArrays: js.UndefOr[Boolean] = js.undefined
  var noEmptyStrings: js.UndefOr[Boolean] = js.undefined
  var noExtraKeywords: js.UndefOr[Boolean] = js.undefined
  var noTypeless: js.UndefOr[Boolean] = js.undefined
  var pedanticCheck: js.UndefOr[Boolean] = js.undefined
  var reportPathAsArray: js.UndefOr[Boolean] = js.undefined
  var strictMode: js.UndefOr[Boolean] = js.undefined
  var strictUris: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    assumeAdditional: js.UndefOr[Boolean] = js.undefined,
    asyncTimeout: js.UndefOr[Double] = js.undefined,
    breakOnFirstError: js.UndefOr[Boolean] = js.undefined,
    customValidator: (/* report */ Report, /* schema */ js.Any, /* json */ js.Any) => Unit = null,
    forceAdditional: js.UndefOr[Boolean] = js.undefined,
    forceItems: js.UndefOr[Boolean] = js.undefined,
    forceMaxItems: js.UndefOr[Boolean] = js.undefined,
    forceMaxLength: js.UndefOr[Boolean] = js.undefined,
    forceMinItems: js.UndefOr[Boolean] = js.undefined,
    forceMinLength: js.UndefOr[Boolean] = js.undefined,
    forceProperties: js.UndefOr[Boolean] = js.undefined,
    ignoreUnknownFormats: js.UndefOr[Boolean] = js.undefined,
    ignoreUnresolvableReferences: js.UndefOr[Boolean] = js.undefined,
    noEmptyArrays: js.UndefOr[Boolean] = js.undefined,
    noEmptyStrings: js.UndefOr[Boolean] = js.undefined,
    noExtraKeywords: js.UndefOr[Boolean] = js.undefined,
    noTypeless: js.UndefOr[Boolean] = js.undefined,
    pedanticCheck: js.UndefOr[Boolean] = js.undefined,
    reportPathAsArray: js.UndefOr[Boolean] = js.undefined,
    strictMode: js.UndefOr[Boolean] = js.undefined,
    strictUris: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assumeAdditional)) __obj.updateDynamic("assumeAdditional")(assumeAdditional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncTimeout)) __obj.updateDynamic("asyncTimeout")(asyncTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(breakOnFirstError)) __obj.updateDynamic("breakOnFirstError")(breakOnFirstError.get.asInstanceOf[js.Any])
    if (customValidator != null) __obj.updateDynamic("customValidator")(js.Any.fromFunction3(customValidator))
    if (!js.isUndefined(forceAdditional)) __obj.updateDynamic("forceAdditional")(forceAdditional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceItems)) __obj.updateDynamic("forceItems")(forceItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMaxItems)) __obj.updateDynamic("forceMaxItems")(forceMaxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMaxLength)) __obj.updateDynamic("forceMaxLength")(forceMaxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMinItems)) __obj.updateDynamic("forceMinItems")(forceMinItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMinLength)) __obj.updateDynamic("forceMinLength")(forceMinLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceProperties)) __obj.updateDynamic("forceProperties")(forceProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownFormats)) __obj.updateDynamic("ignoreUnknownFormats")(ignoreUnknownFormats.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnresolvableReferences)) __obj.updateDynamic("ignoreUnresolvableReferences")(ignoreUnresolvableReferences.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noEmptyArrays)) __obj.updateDynamic("noEmptyArrays")(noEmptyArrays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noEmptyStrings)) __obj.updateDynamic("noEmptyStrings")(noEmptyStrings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noExtraKeywords)) __obj.updateDynamic("noExtraKeywords")(noExtraKeywords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noTypeless)) __obj.updateDynamic("noTypeless")(noTypeless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pedanticCheck)) __obj.updateDynamic("pedanticCheck")(pedanticCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reportPathAsArray)) __obj.updateDynamic("reportPathAsArray")(reportPathAsArray.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictUris)) __obj.updateDynamic("strictUris")(strictUris.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

