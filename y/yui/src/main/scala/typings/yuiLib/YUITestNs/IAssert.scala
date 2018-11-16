package typings
package yuiLib.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssert extends js.Object {
  def areEqual(expected: js.Object, actual: js.Object): scala.Unit = js.native
  def areEqual(expected: js.Object, actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def areNotEqual(unexpected: js.Object, actual: js.Object): scala.Unit = js.native
  def areNotEqual(unexpected: js.Object, actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def areNotSame(unexpected: js.Object, actual: js.Object): scala.Unit = js.native
  def areNotSame(unexpected: js.Object, actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def areSame(expected: js.Object, actual: js.Object): scala.Unit = js.native
  def areSame(expected: js.Object, actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def fail(): scala.Unit = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  def isArray(actual: js.Object): scala.Unit = js.native
  def isArray(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isBoolean(actual: js.Object): scala.Unit = js.native
  def isBoolean(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isFalse(actual: js.Object): scala.Unit = js.native
  def isFalse(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isFunction(actual: js.Object): scala.Unit = js.native
  def isFunction(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isInstanceOf(expected: js.Function, actual: js.Object): scala.Unit = js.native
  def isInstanceOf(expected: js.Function, actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isNaN(actual: js.Object): scala.Unit = js.native
  def isNaN(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isNotNaN(actual: js.Object): scala.Unit = js.native
  def isNotNaN(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isNotNull(actual: js.Object): scala.Unit = js.native
  def isNotNull(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isNotUndefined(actual: js.Object): scala.Unit = js.native
  def isNotUndefined(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isNull(actual: js.Object): scala.Unit = js.native
  def isNull(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isNumber(actual: js.Object): scala.Unit = js.native
  def isNumber(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isObject(actual: js.Object): scala.Unit = js.native
  def isObject(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isString(actual: js.Object): scala.Unit = js.native
  def isString(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isTrue(actual: js.Object): scala.Unit = js.native
  def isTrue(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def isTypeOf(expectedType: java.lang.String, actualValue: js.Object): scala.Unit = js.native
  def isTypeOf(expectedType: java.lang.String, actualValue: js.Object, message: java.lang.String): scala.Unit = js.native
  def isUndefined(actual: js.Object): scala.Unit = js.native
  def isUndefined(actual: js.Object, message: java.lang.String): scala.Unit = js.native
  def pass(): scala.Unit = js.native
  def pass(message: java.lang.String): scala.Unit = js.native
  def throwsError(expectedError: java.lang.String, method: js.Object): scala.Unit = js.native
  def throwsError(expectedError: java.lang.String, method: js.Object, message: java.lang.String): scala.Unit = js.native
  def throwsError(expectedError: js.Function, method: js.Object): scala.Unit = js.native
  def throwsError(expectedError: js.Function, method: js.Object, message: java.lang.String): scala.Unit = js.native
  def throwsError(expectedError: js.Object, method: js.Object): scala.Unit = js.native
  def throwsError(expectedError: js.Object, method: js.Object, message: java.lang.String): scala.Unit = js.native
}

