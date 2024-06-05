/**
 * @jest-environment jsdom
 */
import { render, screen } from "@testing-library/react";
import Page from "./page";

it("Test warning message @tests:KXITM6CNXV7CM7B8ZXAX07WY0P1N7B2", () => {
  render(<Page />);
  expect(screen.getByRole("heading")).toHaveTextContent("Patient App");
});
