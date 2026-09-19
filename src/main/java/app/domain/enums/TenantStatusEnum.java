package app.domain.enums;

public enum TenantStatusEnum {

        ACTIVE("Active"),
        FINISHED("Finished"),
        PENDING("Pending");

        private final String value;

        TenantStatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

