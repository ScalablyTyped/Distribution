package typings
package yupLib.yupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestContext extends js.Object {
  var options: ValidateOptions
  var parent: js.Any
  var path: java.lang.String
  var schema: Schema[_]
  def createError(params: yupLib.Anon_Message): ValidationError
  def resolve(value: js.Any): js.Any
}

