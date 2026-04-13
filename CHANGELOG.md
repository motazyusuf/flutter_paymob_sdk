# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.1] - 2026-04-13

### Changed
- Updated `talker` to `^5.1.16`
- Updated `flutter_lints` to `^6.0.0`

## [1.0.0] - 2026-01-30

### Added
- Initial release of `flutter_paymob_sdk`
- Native Android SDK integration (Paymob SDK 1.6.9)
- Native iOS SDK integration (PaymobSDK 1.0.20)
- Payment intention API support for creating secure payment sessions
- Customizable payment UI options:
  - Custom app name display
  - Customizable button background color
  - Customizable button text color
  - Save card functionality (optional)
  - Show/hide save card option
- Type-safe payment result handling with `PaymobPaymentResult`
- Comprehensive error handling and logging
- Support for Android (API 23+) and iOS (13.0+)
- Full null-safety implementation
- Complete API documentation
- Example app demonstrating usage

### Features
- `PaymobService` class for all payment operations
- `createPaymentIntention()` method for server-side payment setup
- `payWithPaymob()` method for launching native payment SDK
- `PaymobPaymentResult` model for handling payment outcomes
- `PaymobCustomization` model for UI customization
- Automatic native SDK dependency management

### Documentation
- Comprehensive README with installation and usage instructions
- API reference documentation
- Example code and best practices
- Troubleshooting guide

## [0.0.1] - Initial Development

### Added
- Project structure and initial setup
- Basic plugin architecture
