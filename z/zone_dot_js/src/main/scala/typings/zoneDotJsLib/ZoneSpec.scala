package typings
package zoneDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides a way to configure the interception of zone events.
 *
 * Only the `name` property is required (all other are optional).
 */

trait ZoneSpec extends js.Object {
  /**
       * The name of the zone. Useful when debugging Zones.
       */
  var name: java.lang.String
  /**
       * Allows interception of task cancellation.
       *
       * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
       * @param currentZone The current [Zone] where the current interceptor has been declared.
       * @param targetZone The [Zone] which originally received the request.
       * @param task The argument passed into the `cancelTask` method.
       */
  var onCancelTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      _
    ]
  ] = js.undefined
  /**
       * Allows the interception of zone forking.
       *
       * When the zone is being forked, the request is forwarded to this method for interception.
       *
       * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
       * @param currentZone The current [Zone] where the current interceptor has been declared.
       * @param targetZone The [Zone] which originally received the request.
       * @param zoneSpec The argument passed into the `fork` method.
       */
  var onFork: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* zoneSpec */ ZoneSpec, 
      Zone
    ]
  ] = js.undefined
  /**
       * Allows interception of the error handling.
       *
       * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
       * @param currentZone The current [Zone] where the current interceptor has been declared.
       * @param targetZone The [Zone] which originally received the request.
       * @param error The argument passed into the `handleError` method.
       */
  var onHandleError: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* error */ js.Any, 
      scala.Boolean
    ]
  ] = js.undefined
  /**
       * Notifies of changes to the task queue empty status.
       *
       * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
       * @param currentZone The current [Zone] where the current interceptor has been declared.
       * @param targetZone The [Zone] which originally received the request.
       * @param hasTaskState
       */
  var onHasTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* hasTaskState */ HasTaskState, 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Allows interception of the wrapping of the callback.
       *
       * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
       * @param currentZone The current [Zone] where the current interceptor has been declared.
       * @param targetZone The [Zone] which originally received the request.
       * @param delegate The argument passed into the `wrap` method.
       * @param source The argument passed into the `wrap` method.
       */
  var onIntercept: js.UndefOr[
    js.Function5[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* source */ java.lang.String, 
      js.Function
    ]
  ] = js.undefined
  /**
       * Allows interception of the callback invocation.
       *
       * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
       * @param currentZone The current [Zone] where the current interceptor has been declared.
       * @param targetZone The [Zone] which originally received the request.
       * @param delegate The argument passed into the `run` method.
       * @param applyThis The argument passed into the `run` method.
       * @param applyArgs The argument passed into the `run` method.
       * @param source The argument passed into the `run` method.
       */
  var onInvoke: js.UndefOr[
    js.Function7[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* delegate */ js.Function, 
      /* applyThis */ js.Any, 
      /* applyArgs */ js.Array[_], 
      /* source */ java.lang.String, 
      _
    ]
  ] = js.undefined
  var onInvokeTask: js.UndefOr[
    js.Function6[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      /* applyThis */ js.Any, 
      /* applyArgs */ js.Any, 
      _
    ]
  ] = js.undefined
  /**
       * Allows interception of task scheduling.
       *
       * @param parentZoneDelegate Delegate which performs the parent [ZoneSpec] operation.
       * @param currentZone The current [Zone] where the current interceptor has been declared.
       * @param targetZone The [Zone] which originally received the request.
       * @param task The argument passed into the `scheduleTask` method.
       */
  var onScheduleTask: js.UndefOr[
    js.Function4[
      /* parentZoneDelegate */ ZoneDelegate, 
      /* currentZone */ Zone, 
      /* targetZone */ Zone, 
      /* task */ Task, 
      Task
    ]
  ] = js.undefined
  /**
       * A set of properties to be associated with Zone. Use [Zone.get] to retrieve them.
       */
  var properties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
}

