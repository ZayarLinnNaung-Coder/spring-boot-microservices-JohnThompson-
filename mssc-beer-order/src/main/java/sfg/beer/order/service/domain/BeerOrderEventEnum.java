package sfg.beer.order.service.domain;

public enum BeerOrderEventEnum {
    VALIDATE_ORDER, VALIDATION_PASSED, VALIDATION_FAILED,
    ALLOCATION_SUCCESS, ALLOCATION_NO_INVENTORY, ALLOCATION_FALIED, ALLOCATE_ORDER,
}
