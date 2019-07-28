package typings.yui.YUITestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAssert extends js.Object {
  def areEqual(expected: js.Object, actual: js.Object): Unit = js.native
  def areEqual(expected: js.Object, actual: js.Object, message: String): Unit = js.native
  def areNotEqual(unexpected: js.Object, actual: js.Object): Unit = js.native
  def areNotEqual(unexpected: js.Object, actual: js.Object, message: String): Unit = js.native
  def areNotSame(unexpected: js.Object, actual: js.Object): Unit = js.native
  def areNotSame(unexpected: js.Object, actual: js.Object, message: String): Unit = js.native
  def areSame(expected: js.Object, actual: js.Object): Unit = js.native
  def areSame(expected: js.Object, actual: js.Object, message: String): Unit = js.native
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  def isArray(actual: js.Object): Unit = js.native
  def isArray(actual: js.Object, message: String): Unit = js.native
  def isBoolean(actual: js.Object): Unit = js.native
  def isBoolean(actual: js.Object, message: String): Unit = js.native
  def isFalse(actual: js.Object): Unit = js.native
  def isFalse(actual: js.Object, message: String): Unit = js.native
  def isFunction(actual: js.Object): Unit = js.native
  def isFunction(actual: js.Object, message: String): Unit = js.native
  def isInstanceOf(expected: js.Function, actual: js.Object): Unit = js.native
  def isInstanceOf(expected: js.Function, actual: js.Object, message: String): Unit = js.native
  def isNaN(actual: js.Object): Unit = js.native
  def isNaN(actual: js.Object, message: String): Unit = js.native
  def isNotNaN(actual: js.Object): Unit = js.native
  def isNotNaN(actual: js.Object, message: String): Unit = js.native
  def isNotNull(actual: js.Object): Unit = js.native
  def isNotNull(actual: js.Object, message: String): Unit = js.native
  def isNotUndefined(actual: js.Object): Unit = js.native
  def isNotUndefined(actual: js.Object, message: String): Unit = js.native
  def isNull(actual: js.Object): Unit = js.native
  def isNull(actual: js.Object, message: String): Unit = js.native
  def isNumber(actual: js.Object): Unit = js.native
  def isNumber(actual: js.Object, message: String): Unit = js.native
  def isObject(actual: js.Object): Unit = js.native
  def isObject(actual: js.Object, message: String): Unit = js.native
  def isString(actual: js.Object): Unit = js.native
  def isString(actual: js.Object, message: String): Unit = js.native
  def isTrue(actual: js.Object): Unit = js.native
  def isTrue(actual: js.Object, message: String): Unit = js.native
  def isTypeOf(expectedType: String, actualValue: js.Object): Unit = js.native
  def isTypeOf(expectedType: String, actualValue: js.Object, message: String): Unit = js.native
  def isUndefined(actual: js.Object): Unit = js.native
  def isUndefined(actual: js.Object, message: String): Unit = js.native
  def pass(): Unit = js.native
  def pass(message: String): Unit = js.native
  def throwsError(expectedError: String, method: js.Object): Unit = js.native
  def throwsError(expectedError: String, method: js.Object, message: String): Unit = js.native
  def throwsError(expectedError: js.Function, method: js.Object): Unit = js.native
  def throwsError(expectedError: js.Function, method: js.Object, message: String): Unit = js.native
  def throwsError(expectedError: js.Object, method: js.Object): Unit = js.native
  def throwsError(expectedError: js.Object, method: js.Object, message: String): Unit = js.native
}

