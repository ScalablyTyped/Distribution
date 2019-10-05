package typings.zoneDotJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Suppress closure compiler errors about unknown 'global' variable
  * @fileoverview
  * @suppress {undefinedVars}
  */
/**
  * Zone is a mechanism for intercepting and keeping track of asynchronous work.
  *
  * A Zone is a global object which is configured with rules about how to intercept and keep track
  * of the asynchronous callbacks. Zone has these responsibilities:
  *
  * 1. Intercept asynchronous task scheduling
  * 2. Wrap callbacks for error-handling and zone tracking across async operations.
  * 3. Provide a way to attach data to zones
  * 4. Provide a context specific last frame error handling
  * 5. (Intercept blocking methods)
  *
  * A zone by itself does not do anything, instead it relies on some other code to route existing
  * platform API through it. (The zone library ships with code which monkey patches all of the
  * browsers's asynchronous API and redirects them through the zone for interception.)
  *
  * In its simplest form a zone allows one to intercept the scheduling and calling of asynchronous
  * operations, and execute additional code before as well as after the asynchronous task. The rules
  * of interception are configured using [ZoneConfig]. There can be many different zone instances in
  * a system, but only one zone is active at any given time which can be retrieved using
  * [Zone#current].
  *
  *
  *
  * ## Callback Wrapping
  *
  * An important aspect of the zones is that they should persist across asynchronous operations. To
  * achieve this, when a future work is scheduled through async API, it is necessary to capture, and
  * subsequently restore the current zone. For example if a code is running in zone `b` and it
  * invokes `setTimeout` to scheduleTask work later, the `setTimeout` method needs to 1) capture the
  * current zone and 2) wrap the `wrapCallback` in code which will restore the current zone `b` once
  * the wrapCallback executes. In this way the rules which govern the current code are preserved in
  * all future asynchronous tasks. There could be a different zone `c` which has different rules and
  * is associated with different asynchronous tasks. As these tasks are processed, each asynchronous
  * wrapCallback correctly restores the correct zone, as well as preserves the zone for future
  * asynchronous callbacks.
  *
  * Example: Suppose a browser page consist of application code as well as third-party
  * advertisement code. (These two code bases are independent, developed by different mutually
  * unaware developers.) The application code may be interested in doing global error handling and
  * so it configures the `app` zone to send all of the errors to the server for analysis, and then
  * executes the application in the `app` zone. The advertising code is interested in the same
  * error processing but it needs to send the errors to a different third-party. So it creates the
  * `ads` zone with a different error handler. Now both advertising as well as application code
  * create many asynchronous operations, but the [Zone] will ensure that all of the asynchronous
  * operations created from the application code will execute in `app` zone with its error
  * handler and all of the advertisement code will execute in the `ads` zone with its error handler.
  * This will not only work for the async operations created directly, but also for all subsequent
  * asynchronous operations.
  *
  * If you think of chain of asynchronous operations as a thread of execution (bit of a stretch)
  * then [Zone#current] will act as a thread local variable.
  *
  *
  *
  * ## Asynchronous operation scheduling
  *
  * In addition to wrapping the callbacks to restore the zone, all operations which cause a
  * scheduling of work for later are routed through the current zone which is allowed to intercept
  * them by adding work before or after the wrapCallback as well as using different means of
  * achieving the request. (Useful for unit testing, or tracking of requests). In some instances
  * such as `setTimeout` the wrapping of the wrapCallback and scheduling is done in the same
  * wrapCallback, but there are other examples such as `Promises` where the `then` wrapCallback is
  * wrapped, but the execution of `then` is triggered by `Promise` scheduling `resolve` work.
  *
  * Fundamentally there are three kinds of tasks which can be scheduled:
  *
  * 1. [MicroTask] used for doing work right after the current task. This is non-cancelable which is
  *    guaranteed to run exactly once and immediately.
  * 2. [MacroTask] used for doing work later. Such as `setTimeout`. This is typically cancelable
  *    which is guaranteed to execute at least once after some well understood delay.
  * 3. [EventTask] used for listening on some future event. This may execute zero or more times, with
  *    an unknown delay.
  *
  * Each asynchronous API is modeled and routed through one of these APIs.
  *
  *
  * ### [MicroTask]
  *
  * [MicroTask]s represent work which will be done in current VM turn as soon as possible, before VM
  * yielding.
  *
  *
  * ### [MacroTask]
  *
  * [MacroTask]s represent work which will be done after some delay. (Sometimes the delay is
  * approximate such as on next available animation frame). Typically these methods include:
  * `setTimeout`, `setImmediate`, `setInterval`, `requestAnimationFrame`, and all browser specific
  * variants.
  *
  *
  * ### [EventTask]
  *
  * [EventTask]s represent a request to create a listener on an event. Unlike the other task
  * events they may never be executed, but typically execute more than once. There is no queue of
  * events, rather their callbacks are unpredictable both in order and time.
  *
  *
  * ## Global Error Handling
  *
  *
  * ## Composability
  *
  * Zones can be composed together through [Zone.fork()]. A child zone may create its own set of
  * rules. A child zone is expected to either:
  *
  * 1. Delegate the interception to a parent zone, and optionally add before and after wrapCallback
  *    hooks.
  * 2. Process the request itself without delegation.
  *
  * Composability allows zones to keep their concerns clean. For example a top most zone may choose
  * to handle error handling, while child zones may choose to do user action tracking.
  *
  *
  * ## Root Zone
  *
  * At the start the browser will run in a special root zone, which is configured to behave exactly
  * like the platform, making any existing code which is not zone-aware behave as expected. All
  * zones are children of the root zone.
  *
  */
@js.native
trait Zone extends js.Object {
  /**
    * @returns {string} The Zone name (useful for debugging)
    */
  var name: String = js.native
  /**
    *
    * @returns {Zone} The parent Zone.
    */
  var parent: Zone | Null = js.native
  /**
    * Allows the zone to intercept canceling of scheduled Task.
    *
    * The interception is configured using [ZoneSpec.onCancelTask]. The default canceler invokes
    * the [Task.cancelFn].
    *
    * @param task
    * @returns {any}
    */
  def cancelTask(task: Task): js.Any = js.native
  /**
    * Used to create a child zone.
    *
    * @param zoneSpec A set of rules which the child zone should follow.
    * @returns {Zone} A new child zone.
    */
  def fork(zoneSpec: ZoneSpec): Zone = js.native
  /**
    * Returns a value associated with the `key`.
    *
    * If the current zone does not have a key, the request is delegated to the parent zone. Use
    * [ZoneSpec.properties] to configure the set of properties associated with the current zone.
    *
    * @param key The key to retrieve.
    * @returns {any} The value for the key, or `undefined` if not found.
    */
  def get(key: String): js.Any = js.native
  /**
    * Returns a Zone which defines a `key`.
    *
    * Recursively search the parent Zone until a Zone which has a property `key` is found.
    *
    * @param key The key to use for identification of the returned zone.
    * @returns {Zone} The Zone which defines the `key`, `null` if not found.
    */
  def getZoneWith(key: String): Zone | Null = js.native
  /**
    * Invokes a function in a given zone.
    *
    * The invocation of `callback` can be intercepted by declaring [ZoneSpec.onInvoke].
    *
    * @param callback The function to invoke.
    * @param applyThis
    * @param applyArgs
    * @param source A unique debug location of the API being invoked.
    * @returns {any} Value from the `callback` function.
    */
  def run[T](callback: js.Function): T = js.native
  def run[T](callback: js.Function, applyThis: js.Any): T = js.native
  def run[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_]): T = js.native
  def run[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_], source: String): T = js.native
  /**
    * Invokes a function in a given zone and catches any exceptions.
    *
    * Any exceptions thrown will be forwarded to [Zone.HandleError].
    *
    * The invocation of `callback` can be intercepted by declaring [ZoneSpec.onInvoke]. The
    * handling of exceptions can be intercepted by declaring [ZoneSpec.handleError].
    *
    * @param callback The function to invoke.
    * @param applyThis
    * @param applyArgs
    * @param source A unique debug location of the API being invoked.
    * @returns {any} Value from the `callback` function.
    */
  def runGuarded[T](callback: js.Function): T = js.native
  def runGuarded[T](callback: js.Function, applyThis: js.Any): T = js.native
  def runGuarded[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_]): T = js.native
  def runGuarded[T](callback: js.Function, applyThis: js.Any, applyArgs: js.Array[_], source: String): T = js.native
  /**
    * Execute the Task by restoring the [Zone.currentTask] in the Task's zone.
    *
    * @param task to run
    * @param applyThis
    * @param applyArgs
    * @returns {*}
    */
  def runTask(task: Task): js.Any = js.native
  def runTask(task: Task, applyThis: js.Any): js.Any = js.native
  def runTask(task: Task, applyThis: js.Any, applyArgs: js.Any): js.Any = js.native
  /**
    * Schedule an EventTask.
    *
    * @param source
    * @param callback
    * @param data
    * @param customSchedule
    * @param customCancel
    */
  def scheduleEventTask(source: String, callback: js.Function): EventTask = js.native
  def scheduleEventTask(source: String, callback: js.Function, data: TaskData): EventTask = js.native
  def scheduleEventTask(
    source: String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, Unit]
  ): EventTask = js.native
  def scheduleEventTask(
    source: String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, Unit],
    customCancel: js.Function1[/* task */ Task, Unit]
  ): EventTask = js.native
  /**
    * Schedule a MacroTask.
    *
    * @param source
    * @param callback
    * @param data
    * @param customSchedule
    * @param customCancel
    */
  def scheduleMacroTask(source: String, callback: js.Function): MacroTask = js.native
  def scheduleMacroTask(source: String, callback: js.Function, data: TaskData): MacroTask = js.native
  def scheduleMacroTask(
    source: String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, Unit]
  ): MacroTask = js.native
  def scheduleMacroTask(
    source: String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, Unit],
    customCancel: js.Function1[/* task */ Task, Unit]
  ): MacroTask = js.native
  /**
    * Schedule a MicroTask.
    *
    * @param source
    * @param callback
    * @param data
    * @param customSchedule
    */
  def scheduleMicroTask(source: String, callback: js.Function): MicroTask = js.native
  def scheduleMicroTask(source: String, callback: js.Function, data: TaskData): MicroTask = js.native
  def scheduleMicroTask(
    source: String,
    callback: js.Function,
    data: TaskData,
    customSchedule: js.Function1[/* task */ Task, Unit]
  ): MicroTask = js.native
  /**
    * Schedule an existing Task.
    *
    * Useful for rescheduling a task which was already canceled.
    *
    * @param task
    */
  def scheduleTask[T /* <: Task */](task: T): T = js.native
  /**
    * Wraps a callback function in a new function which will properly restore the current zone upon
    * invocation.
    *
    * The wrapped function will properly forward `this` as well as `arguments` to the `callback`.
    *
    * Before the function is wrapped the zone can intercept the `callback` by declaring
    * [ZoneSpec.onIntercept].
    *
    * @param callback the function which will be wrapped in the zone.
    * @param source A unique debug location of the API being wrapped.
    * @returns {function(): *} A function which will invoke the `callback` through [Zone.runGuarded].
    */
  def wrap[F /* <: js.Function */](callback: F, source: String): F = js.native
}

@JSGlobal("Zone")
@js.native
object Zone extends TopLevel[ZoneType]

