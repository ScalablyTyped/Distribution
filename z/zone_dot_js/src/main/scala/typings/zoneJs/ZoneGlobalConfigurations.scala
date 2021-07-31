package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @license
  * Copyright Google LLC All Rights Reserved.
  *
  * Use of this source code is governed by an MIT-style license that can be
  * found in the LICENSE file at https://angular.io/license
  */
/**
  * Interface of `zone.js` configurations.
  *
  * You can define the following configurations on the `window/global` object before
  * importing `zone.js` to change `zone.js` default behaviors.
  */
trait ZoneGlobalConfigurations extends StObject {
  
  /**
    * Disable the monkey patch of the `Node.js` `EventEmitter` API.
    *
    * By default, `zone.js` monkey patches the `Node.js` `EventEmitter` APIs to make asynchronous
    * callbacks of those APIs in the same zone when scheduled.
    *
    * Consider the following example:
    *
    * ```
    * const EventEmitter = require('events');
    * class MyEmitter extends EventEmitter {}
    * const myEmitter = new MyEmitter();
    *
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   myEmitter.on('event', () => {
    *     console.log('an event occurs in the zone', Zone.current.name);
    *     // the callback runs in the zone when it is scheduled,
    *     // so the output is 'an event occurs in the zone myZone'.
    *   });
    * });
    * myEmitter.emit('event');
    * ```
    *
    * If you set `__Zone_disable_EventEmitter = true` before importing `zone.js`,
    * `zone.js` does not monkey patch the `EventEmitter` APIs and the above code
    * outputs 'an event occurred <root>'.
    */
  var __Zone_disable_EventEmitter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `EventTarget` APIs.
    *
    * By default, `zone.js` monkey patches EventTarget APIs. The callbacks of the
    * `addEventListener()` run in the same zone when the `addEventListener()` is called.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   div.addEventListener('click', () => {
    *     console.log('div event listener is invoked in the zone', Zone.current.name);
    *     // the output is 'div event listener is invoked in the zone myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_EventTarget = true` before importing `zone.js`,
    * `zone.js` does not monkey patch EventTarget API and the above code
    * outputs 'clicked <root>'.
    *
    */
  var __Zone_disable_EventTarget: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser legacy `EventTarget` API.
    *
    * NOTE: This configuration is only available in the legacy bundle (dist/zone.js), this module
    * is not available in the evergreen bundle (zone-evergreen.js).
    *
    * In some old browsers, the `EventTarget` is not available, so `zone.js` cannot directly monkey
    * patch the `EventTarget`. Instead, `zone.js` patches all known HTML elements' prototypes (such
    * as `HtmlDivElement`). The callback of the `addEventListener()` will be in the same zone when
    * the `addEventListener()` is called.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   div.addEventListener('click', () => {
    *     console.log('div click event listener is invoked in the zone', Zone.current.name);
    *     // the output is 'div click event listener is invoked in the zone myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_EventTargetLegacy = true` before importing `zone.js`
    * In some old browsers, where `EventTarget` is not available, if you set
    * `__Zone_disable_EventTargetLegacy = true` before importing `zone.js`, `zone.js` does not monkey
    * patch all HTML element APIs and the above code outputs 'clicked <root>'.
    */
  var __Zone_disable_EventTargetLegacy: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `FileReader` APIs.
    */
  var __Zone_disable_FileReader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `IntersectionObserver` APIs.
    */
  var __Zone_disable_IntersectionObserver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `MutationObserver` APIs.
    */
  var __Zone_disable_MutationObserver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `XMLHttpRequest` APIs.
    *
    * By default, `zone.js` monkey patches `XMLHttpRequest` APIs to make XMLHttpRequest act
    * as macroTask.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({
    *   name: 'myZone',
    *   onScheduleTask: (delegate, curr, target, task) => {
    *     console.log('task is scheduled', task.type, task.source, task.zone.name);
    *     return delegate.scheduleTask(target, task);
    *   }
    * })
    * const xhr = new XMLHttpRequest();
    * zone.run(() => {
    *   xhr.onload = function() {};
    *   xhr.open('get', '/', true);
    *   xhr.send();
    * });
    * ```
    *
    * In this example, the instance of XMLHttpRequest runs in the zone and acts as a macroTask. The
    * output is 'task is scheduled macroTask, XMLHttpRequest.send, zone'.
    *
    * If you set `__Zone_disable_XHR = true` before importing `zone.js`,
    * `zone.js` does not monkey patch `XMLHttpRequest` APIs and the above onScheduleTask callback
    * will not be called.
    *
    */
  var __Zone_disable_XHR: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the `Promise` monkey patch.
    *
    * By default, `zone.js` monkey patches `Promise` APIs to make the `then()/catch()` callbacks in
    * the same zone when those callbacks are called.
    *
    * Consider the following examples:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    *
    * const p = Promise.resolve(1);
    *
    * zone.run(() => {
    *   p.then(() => {
    *     console.log('then() callback is invoked in the zone', Zone.current.name);
    *     // output is 'then() callback is invoked in the zone myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_ZoneAwarePromise = true` before importing `zone.js`,
    * `zone.js` does not monkey patch `Promise` APIs and the above code
    * outputs 'promise then callback <root>'.
    */
  var __Zone_disable_ZoneAwarePromise: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Disable the monkey patch of the browser blocking APIs(`alert()`/`prompt()`/`confirm()`).
    */
  var __Zone_disable_blocking: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `canvas` APIs.
    *
    * By default, `zone.js` monkey patches `canvas` APIs to make callbacks run in the same zone when
    * those APIs are called.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({
    *   name: 'myZone'
    * });
    *
    * zone.run(() => {
    *   canvas.toBlob(blog => {
    *     console.log('canvas.toBlob() callback is invoked in the zone', Zone.current.name);
    *     // output is 'canvas.toBlob() callback is invoked in the zone myZone'.
    *   }
    * });
    * ```
    *
    * If you set `__Zone_disable_canvas = true` before importing `zone.js`,
    * `zone.js` does not monkey patch `canvas` APIs and the above code
    * outputs 'canvas.toBlob <root>'.
    */
  var __Zone_disable_canvas: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the `Node.js` `crypto` API.
    *
    * By default, `zone.js` monkey patches the `Node.js` `crypto` APIs to make asynchronous callbacks
    * of those APIs in the same zone when called.
    *
    * Consider the following example:
    *
    * ```
    * const crypto = require('crypto');
    *
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   crypto.randomBytes(() => {
    *     console.log('crypto.randomBytes() callback is invoked in the zone', Zone.current.name);
    *     // since the callback of `crypto.randomBytes()` runs in the same zone
    *     // when it is called, so the output is 'crypto.randomBytes() callback is invoked in the
    *     // zone myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_crypto = true` before importing `zone.js`,
    * `zone.js` does not monkey patch the `crypto` API and the above code
    * outputs 'crypto <root>'.
    */
  var __Zone_disable_crypto: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `customElements` APIs.
    *
    * By default, `zone.js` monkey patches `customElements` APIs to make callbacks run in the
    * same zone when the `customElements.define()` is called.
    *
    * Consider the following example:
    *
    * ```
    * class TestCustomElement extends HTMLElement {
    *   constructor() { super(); }
    *   connectedCallback() {}
    *   disconnectedCallback() {}
    *   attributeChangedCallback(attrName, oldVal, newVal) {}
    *   adoptedCallback() {}
    * }
    *
    * const zone = Zone.fork({name: 'myZone'});
    * zone.run(() => {
    *   customElements.define('x-elem', TestCustomElement);
    * });
    * ```
    *
    * All those callbacks defined in TestCustomElement runs in the zone when
    * the `customElements.define()` is called.
    *
    * If you set `__Zone_disable_customElements = true` before importing `zone.js`,
    * `zone.js` does not monkey patch `customElements` APIs and the above code
    * runs inside <root> zone.
    */
  var __Zone_disable_customElements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the `Object.defineProperty()` API.
    *
    * Note: This configuration is available only in the legacy bundle (dist/zone.js). This module is
    * not available in the evergreen bundle (zone-evergreen.js).
    *
    * In the legacy browser, the default behavior of `zone.js` is to monkey patch
    * `Object.defineProperty()` and `Object.create()` to try to ensure PropertyDescriptor parameter's
    * configurable property to be true. This patch is only needed in some old mobile browsers.
    *
    * If you set `__Zone_disable_defineProperty = true` before importing `zone.js`,
    * `zone.js` does not monkey patch the `Object.defineProperty()` API and does not
    * modify desc.configurable to true.
    *
    */
  var __Zone_disable_defineProperty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the `Node.js` `fs` API.
    *
    * By default, `zone.js` monkey patches `Node.js` `fs` APIs to make asynchronous callbacks of
    * those APIs in the same zone when scheduled.
    *
    * Consider the following example:
    *
    * ```
    * const fs = require('fs');
    *
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   fs.stat('/tmp/world', (err, stats) => {
    *     console.log('fs.stats() callback is invoked in the zone', Zone.current.name);
    *     // since the callback of the `fs.stat()` runs in the same zone
    *     // when it is called, so the output is 'fs.stats() callback is invoked in the zone myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_fs = true` before importing `zone.js`,
    * `zone.js` does not monkey patch the `fs` API and the above code
    * outputs 'get stats occurred <root>'.
    */
  var __Zone_disable_fs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser geolocation APIs.
    *
    * By default, `zone.js` monkey patches geolocation APIs to make callbacks run in the same zone
    * when those APIs are called.
    *
    * Consider the following examples:
    *
    * ```
    * const zone = Zone.current.fork({
    *   name: 'myZone'
    * });
    *
    * zone.run(() => {
    *   navigator.geolocation.getCurrentPosition(pos => {
    *     console.log('navigator.getCurrentPosition() callback is invoked in the zone',
    *     Zone.current.name);
    *     // output is 'navigator.getCurrentPosition() callback is invoked in the zone myZone'.
    *   }
    * });
    * ```
    *
    * If set you `__Zone_disable_geolocation = true` before importing `zone.js`,
    * `zone.js` does not monkey patch geolocation APIs and the above code
    * outputs 'getCurrentPosition <root>'.
    *
    */
  var __Zone_disable_geolocation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the `Node.js` `process.nextTick()` API.
    *
    * By default, `zone.js` monkey patches the `Node.js` `process.nextTick()` API to make the
    * callback in the same zone when calling `process.nextTick()`.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   process.nextTick(() => {
    *     console.log('process.nextTick() callback is invoked in the zone', Zone.current.name);
    *     // since the callback of `process.nextTick()` runs in the same zone
    *     // when it is scheduled, so the output is 'process.nextTick() callback is invoked in the
    *     // zone myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_nextTick = true` before importing `zone.js`,
    * `zone.js` does not monkey patch the `process.nextTick()` API and the above code
    * outputs 'nextTick <root>'.
    */
  var __Zone_disable_nextTick: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the `Node.js` `timer` API.
    *
    * By default, `zone.js` monkey patches the `Node.js` `timer` APIs to make asynchronous
    * callbacks of those APIs in the same zone when scheduled.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   setTimeout(() => {
    *     console.log('setTimeout() callback is invoked in the zone', Zone.current.name);
    *     // since the callback of `setTimeout()` runs in the same zone
    *     // when it is scheduled, so the output is 'setTimeout() callback is invoked in the zone
    *     // myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_timers = true` before importing `zone.js`,
    * `zone.js` does not monkey patch the `timer` APIs and the above code
    * outputs 'timeout <root>'.
    */
  var __Zone_disable_node_timers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser onProperty APIs(such as onclick).
    *
    * By default, `zone.js` monkey patches onXXX properties (such as onclick). The callbacks of onXXX
    * properties run in the same zone when the onXXX properties is set.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   div.onclick = () => {
    *     console.log('div click event listener is invoked in the zone', Zone.current.name);
    *     // the output will be 'div click event listener is invoked in the zone myZone'
    *   }
    * });
    * ```
    *
    * If you set `__Zone_disable_on_property = true` before importing `zone.js`,
    * `zone.js` does not monkey patch onXXX properties and the above code
    * outputs 'clicked <root>'.
    *
    */
  var __Zone_disable_on_property: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `registerElement()` API.
    *
    * NOTE: This configuration is only available in the legacy bundle (dist/zone.js), this
    * module is not available in the evergreen bundle (zone-evergreen.js).
    *
    * In the legacy browser, the default behavior of `zone.js` is to monkey patch the
    * `registerElement()` API to make asynchronous callbacks of the API in the same zone when
    * `registerElement()` is called.
    *
    * Consider the following example:
    *
    * ```
    * const proto = Object.create(HTMLElement.prototype);
    * proto.createdCallback = function() {
    *   console.log('createdCallback is invoked in the zone', Zone.current.name);
    * };
    * proto.attachedCallback = function() {
    *   console.log('attachedCallback is invoked in the zone', Zone.current.name);
    * };
    * proto.detachedCallback = function() {
    *   console.log('detachedCallback is invoked in the zone', Zone.current.name);
    * };
    * proto.attributeChangedCallback = function() {
    *   console.log('attributeChangedCallback is invoked in the zone', Zone.current.name);
    * };
    *
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   document.registerElement('x-elem', {prototype: proto});
    * });
    * ```
    *
    * When these callbacks are invoked, those callbacks will be in the zone when
    * `registerElement()` is called.
    *
    * If you set `__Zone_disable_registerElement = true` before importing `zone.js`,
    * `zone.js` does not monkey patch `registerElement()` API and the above code
    * outputs '<root>'.
    */
  var __Zone_disable_registerElement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `requestAnimationFrame()` API.
    *
    * By default, `zone.js` monkey patches the browser `requestAnimationFrame()` API
    * to make the asynchronous callback of the `requestAnimationFrame()` in the same zone when
    * scheduled.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   requestAnimationFrame(() => {
    *     console.log('requestAnimationFrame() callback is invoked in the zone', Zone.current.name);
    *     // since the callback of `requestAnimationFrame()` will be in the same zone
    *     // when it is scheduled, so the output will be 'requestAnimationFrame() callback is invoked
    *     // in the zone myZone'
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_requestAnimationFrame = true` before importing `zone.js`,
    * `zone.js` does not monkey patch the `requestAnimationFrame()` API and the above code
    * outputs 'raf <root>'.
    */
  var __Zone_disable_requestAnimationFrame: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the monkey patch of the browser `timer` APIs.
    *
    * By default, `zone.js` monkey patches browser timer
    * APIs (`setTimeout()`/`setInterval()`/`setImmediate()`) to make asynchronous callbacks of those
    * APIs in the same zone when scheduled.
    *
    * Consider the following example:
    *
    * ```
    * const zone = Zone.current.fork({name: 'myZone'});
    * zone.run(() => {
    *   setTimeout(() => {
    *     console.log('setTimeout() callback is invoked in the zone', Zone.current.name);
    *     // since the callback of `setTimeout()` runs in the same zone
    *     // when it is scheduled, so the output is 'setTimeout() callback is invoked in the zone
    *     // myZone'.
    *   });
    * });
    * ```
    *
    * If you set `__Zone_disable_timers = true` before importing `zone.js`,
    * `zone.js` does not monkey patch `timer` API and the above code
    * outputs 'timeout <root>'.
    *
    */
  var __Zone_disable_timers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable wrapping uncaught promise rejection.
    *
    * By default, `zone.js` wraps the uncaught promise rejection in a new `Error` object
    * which contains additional information such as a value of the rejection and a stack trace.
    *
    * If you set `__zone_symbol__DISABLE_WRAPPING_UNCAUGHT_PROMISE_REJECTION = true;` before
    * importing `zone.js`, `zone.js` will not wrap the uncaught promise rejection.
    */
  var __zone_symbol__DISABLE_WRAPPING_UNCAUGHT_PROMISE_REJECTION: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Define the event names of the passive listeners.
    *
    * To add passive event listeners, you can use `elem.addEventListener('scroll', listener,
    * {passive: true});` or implement your own `EventManagerPlugin`.
    *
    * You can also define a global variable as follows:
    *
    * ```
    * __zone_symbol__PASSIVE_EVENTS = ['scroll'];
    * ```
    *
    * The preceding code makes all scroll event listeners passive.
    */
  var __zone_symbol__PASSIVE_EVENTS: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Define event names that users don't want monkey patched by the `zone.js`.
    *
    * By default, `zone.js` monkey patches EventTarget.addEventListener(). The event listener
    * callback runs in the same zone when the addEventListener() is called.
    *
    * Sometimes, you don't want all of the event names used in this patched version because it
    * impacts performance. For example, you might want `scroll` or `mousemove` event listeners to run
    * the native `addEventListener()` for better performance.
    *
    * Users can achieve this goal by defining `__zone_symbol__UNPATCHED_EVENTS = ['scroll',
    * 'mousemove'];` before importing `zone.js`.
    */
  var __zone_symbol__UNPATCHED_EVENTS: js.UndefOr[js.Array[String]] = js.undefined
}
object ZoneGlobalConfigurations {
  
  @scala.inline
  def apply(): ZoneGlobalConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneGlobalConfigurations]
  }
  
  @scala.inline
  implicit class ZoneGlobalConfigurationsMutableBuilder[Self <: ZoneGlobalConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__Zone_disable_EventEmitter(value: Boolean): Self = StObject.set(x, "__Zone_disable_EventEmitter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_EventEmitterUndefined: Self = StObject.set(x, "__Zone_disable_EventEmitter", js.undefined)
    
    @scala.inline
    def set__Zone_disable_EventTarget(value: Boolean): Self = StObject.set(x, "__Zone_disable_EventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_EventTargetLegacy(value: Boolean): Self = StObject.set(x, "__Zone_disable_EventTargetLegacy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_EventTargetLegacyUndefined: Self = StObject.set(x, "__Zone_disable_EventTargetLegacy", js.undefined)
    
    @scala.inline
    def set__Zone_disable_EventTargetUndefined: Self = StObject.set(x, "__Zone_disable_EventTarget", js.undefined)
    
    @scala.inline
    def set__Zone_disable_FileReader(value: Boolean): Self = StObject.set(x, "__Zone_disable_FileReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_FileReaderUndefined: Self = StObject.set(x, "__Zone_disable_FileReader", js.undefined)
    
    @scala.inline
    def set__Zone_disable_IntersectionObserver(value: Boolean): Self = StObject.set(x, "__Zone_disable_IntersectionObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_IntersectionObserverUndefined: Self = StObject.set(x, "__Zone_disable_IntersectionObserver", js.undefined)
    
    @scala.inline
    def set__Zone_disable_MutationObserver(value: Boolean): Self = StObject.set(x, "__Zone_disable_MutationObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_MutationObserverUndefined: Self = StObject.set(x, "__Zone_disable_MutationObserver", js.undefined)
    
    @scala.inline
    def set__Zone_disable_XHR(value: Boolean): Self = StObject.set(x, "__Zone_disable_XHR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_XHRUndefined: Self = StObject.set(x, "__Zone_disable_XHR", js.undefined)
    
    @scala.inline
    def set__Zone_disable_ZoneAwarePromise(value: Boolean): Self = StObject.set(x, "__Zone_disable_ZoneAwarePromise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_ZoneAwarePromiseUndefined: Self = StObject.set(x, "__Zone_disable_ZoneAwarePromise", js.undefined)
    
    @scala.inline
    def set__Zone_disable_blocking(value: Boolean): Self = StObject.set(x, "__Zone_disable_blocking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_blockingUndefined: Self = StObject.set(x, "__Zone_disable_blocking", js.undefined)
    
    @scala.inline
    def set__Zone_disable_canvas(value: Boolean): Self = StObject.set(x, "__Zone_disable_canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_canvasUndefined: Self = StObject.set(x, "__Zone_disable_canvas", js.undefined)
    
    @scala.inline
    def set__Zone_disable_crypto(value: Boolean): Self = StObject.set(x, "__Zone_disable_crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_cryptoUndefined: Self = StObject.set(x, "__Zone_disable_crypto", js.undefined)
    
    @scala.inline
    def set__Zone_disable_customElements(value: Boolean): Self = StObject.set(x, "__Zone_disable_customElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_customElementsUndefined: Self = StObject.set(x, "__Zone_disable_customElements", js.undefined)
    
    @scala.inline
    def set__Zone_disable_defineProperty(value: Boolean): Self = StObject.set(x, "__Zone_disable_defineProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_definePropertyUndefined: Self = StObject.set(x, "__Zone_disable_defineProperty", js.undefined)
    
    @scala.inline
    def set__Zone_disable_fs(value: Boolean): Self = StObject.set(x, "__Zone_disable_fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_fsUndefined: Self = StObject.set(x, "__Zone_disable_fs", js.undefined)
    
    @scala.inline
    def set__Zone_disable_geolocation(value: Boolean): Self = StObject.set(x, "__Zone_disable_geolocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_geolocationUndefined: Self = StObject.set(x, "__Zone_disable_geolocation", js.undefined)
    
    @scala.inline
    def set__Zone_disable_nextTick(value: Boolean): Self = StObject.set(x, "__Zone_disable_nextTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_nextTickUndefined: Self = StObject.set(x, "__Zone_disable_nextTick", js.undefined)
    
    @scala.inline
    def set__Zone_disable_node_timers(value: Boolean): Self = StObject.set(x, "__Zone_disable_node_timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_node_timersUndefined: Self = StObject.set(x, "__Zone_disable_node_timers", js.undefined)
    
    @scala.inline
    def set__Zone_disable_on_property(value: Boolean): Self = StObject.set(x, "__Zone_disable_on_property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_on_propertyUndefined: Self = StObject.set(x, "__Zone_disable_on_property", js.undefined)
    
    @scala.inline
    def set__Zone_disable_registerElement(value: Boolean): Self = StObject.set(x, "__Zone_disable_registerElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_registerElementUndefined: Self = StObject.set(x, "__Zone_disable_registerElement", js.undefined)
    
    @scala.inline
    def set__Zone_disable_requestAnimationFrame(value: Boolean): Self = StObject.set(x, "__Zone_disable_requestAnimationFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_requestAnimationFrameUndefined: Self = StObject.set(x, "__Zone_disable_requestAnimationFrame", js.undefined)
    
    @scala.inline
    def set__Zone_disable_timers(value: Boolean): Self = StObject.set(x, "__Zone_disable_timers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__Zone_disable_timersUndefined: Self = StObject.set(x, "__Zone_disable_timers", js.undefined)
    
    @scala.inline
    def set__zone_symbol__DISABLE_WRAPPING_UNCAUGHT_PROMISE_REJECTION(value: Boolean): Self = StObject.set(x, "__zone_symbol__DISABLE_WRAPPING_UNCAUGHT_PROMISE_REJECTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__zone_symbol__DISABLE_WRAPPING_UNCAUGHT_PROMISE_REJECTIONUndefined: Self = StObject.set(x, "__zone_symbol__DISABLE_WRAPPING_UNCAUGHT_PROMISE_REJECTION", js.undefined)
    
    @scala.inline
    def set__zone_symbol__PASSIVE_EVENTS(value: js.Array[String]): Self = StObject.set(x, "__zone_symbol__PASSIVE_EVENTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__zone_symbol__PASSIVE_EVENTSUndefined: Self = StObject.set(x, "__zone_symbol__PASSIVE_EVENTS", js.undefined)
    
    @scala.inline
    def set__zone_symbol__PASSIVE_EVENTSVarargs(value: String*): Self = StObject.set(x, "__zone_symbol__PASSIVE_EVENTS", js.Array(value :_*))
    
    @scala.inline
    def set__zone_symbol__UNPATCHED_EVENTS(value: js.Array[String]): Self = StObject.set(x, "__zone_symbol__UNPATCHED_EVENTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__zone_symbol__UNPATCHED_EVENTSUndefined: Self = StObject.set(x, "__zone_symbol__UNPATCHED_EVENTS", js.undefined)
    
    @scala.inline
    def set__zone_symbol__UNPATCHED_EVENTSVarargs(value: String*): Self = StObject.set(x, "__zone_symbol__UNPATCHED_EVENTS", js.Array(value :_*))
  }
}
