package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UncaughtPromiseError
  extends stdLib.Error {
  var promise: js.Promise[_]
  var rejection: js.Any
  var task: Task
  var zone: Zone
}

