package typings
package zDashSchemaLib.zDashSchemaMod.ValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var assumeAdditional: js.UndefOr[scala.Boolean] = js.undefined
  var asyncTimeout: js.UndefOr[scala.Double] = js.undefined
  var breakOnFirstError: js.UndefOr[scala.Boolean] = js.undefined
  var customValidator: js.UndefOr[
    js.Function3[
      /* report */ zDashSchemaLib.zDashSchemaMod.Report, 
      /* schema */ js.Any, 
      /* json */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var forceAdditional: js.UndefOr[scala.Boolean] = js.undefined
  var forceItems: js.UndefOr[scala.Boolean] = js.undefined
  var forceMaxItems: js.UndefOr[scala.Boolean] = js.undefined
  var forceMaxLength: js.UndefOr[scala.Boolean] = js.undefined
  var forceMinItems: js.UndefOr[scala.Boolean] = js.undefined
  var forceMinLength: js.UndefOr[scala.Boolean] = js.undefined
  var forceProperties: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnknownFormats: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreUnresolvableReferences: js.UndefOr[scala.Boolean] = js.undefined
  var noEmptyArrays: js.UndefOr[scala.Boolean] = js.undefined
  var noEmptyStrings: js.UndefOr[scala.Boolean] = js.undefined
  var noExtraKeywords: js.UndefOr[scala.Boolean] = js.undefined
  var noTypeless: js.UndefOr[scala.Boolean] = js.undefined
  var pedanticCheck: js.UndefOr[scala.Boolean] = js.undefined
  var reportPathAsArray: js.UndefOr[scala.Boolean] = js.undefined
  var strictMode: js.UndefOr[scala.Boolean] = js.undefined
  var strictUris: js.UndefOr[scala.Boolean] = js.undefined
}

